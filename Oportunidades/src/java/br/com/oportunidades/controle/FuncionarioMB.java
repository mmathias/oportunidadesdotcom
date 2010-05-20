/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.controle;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.oportunidades.dao.DaoFactory;
import br.com.oportunidades.dao.FuncionarioDao;
import br.com.oportunidades.modelo.Endereco;
import br.com.oportunidades.modelo.Funcionario;
import br.com.oportunidades.modelo.Funcionario.Tipo;
import br.com.oportunidades.modelo.Telefone;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author User
 */
public class FuncionarioMB {

    public static final String PAGINA_ALTERAR_SENHA = "def:alterarSenha";
    public static final String PAGINA_CADASTRO_FUNCIONARIO = "def:cadastroFuncionario";
    public static final String PAGINA_HOME = "def:home";
    private Funcionario funcionarioCorrente;
    private DaoFactory factory;
    private FuncionarioDao funcionarioDao;
    private String confirmarSenha;
    private ListDataModel listaFuncionarios;
    private boolean novoFuncionario;
    private List<SelectItem> comboTipoFunc;
    private int tipoFunc;
    private String senhaAntiga;
    private String novaSenha;

    public String cadastrarFuncionario() {
        factory = new DaoFactory();
        funcionarioDao = factory.getFuncionarioDao();
        funcionarioCorrente.setEspecificacao(Tipo.values()[tipoFunc]);
        System.out.println("Tipo: " + tipoFunc);

        if (!confirmarSenha.equals(funcionarioCorrente.getSenha())) {
            return null;//TODO retornar mensagem de erro dizendo que a confirmaçao de senha nao bate com a senha
        }
        if (!novoFuncionario) {
            factory.beginTransaction();
            funcionarioDao.atualiza(funcionarioCorrente);
            factory.commit();
            factory.close();
            listaFuncionarios = null;
            funcionarioCorrente = null;
            return PAGINA_HOME;
        } else {

            Funcionario func = funcionarioDao.procurarPorCpf(funcionarioCorrente.getCPF());
            if (func != null) {
                return null;//TODO retornar erro com mensagem dizendo que o cpf já está cadsatrado no sistema
            }
            func = funcionarioDao.procurarPorUsuario(funcionarioCorrente.getUsuario());
            if (func != null) {
                return null;//TODO retornar ERRO com mensagem dizendo que o usuario já está cadastrado no sistema
            }

            factory.beginTransaction();
            funcionarioDao.adicionar(funcionarioCorrente);
            factory.commit();
            factory.close();
            funcionarioCorrente = null;
            listaFuncionarios = null;
            return PAGINA_HOME;
        }
    }

    public String paginaAlterarSenha() {
        return PAGINA_ALTERAR_SENHA;
    }

    public String alterarSenha() {
        if (!senhaAntiga.equals(funcionarioCorrente.getSenha())) {
            return null;
        }
        if (novaSenha.equals(confirmarSenha)) {
            funcionarioCorrente.setSenha(novaSenha);
            return PAGINA_CADASTRO_FUNCIONARIO;
        } else {
            return null;
        }
    }

    public String paginaCadastrarFuncionario() {
        novoFuncionario = true;
        funcionarioCorrente = new Funcionario();
        funcionarioCorrente.setEndereco(new Endereco());
        funcionarioCorrente.setTelefones(new Telefone());
        return PAGINA_CADASTRO_FUNCIONARIO;
    }

    public String paginaAlterarDados() {
        novoFuncionario = false;
        funcionarioCorrente = (Funcionario) listaFuncionarios.getRowData();
        return PAGINA_CADASTRO_FUNCIONARIO;
    }

    public String listarTodos() {
        factory = new DaoFactory();
        funcionarioDao = factory.getFuncionarioDao();
        List<Funcionario> funcionarios = funcionarioDao.listarTudo();
        listaFuncionarios = new ListDataModel(funcionarios);
        factory.close();
        return PAGINA_HOME;
    }

    /**
     * @return the funcionarioCorrente
     */
    public Funcionario getFuncionarioCorrente() {
        return funcionarioCorrente;
    }

    /**
     * @param funcionarioCorrente the funcionarioCorrente to set
     */
    public void setFuncionarioCorrente(Funcionario funcionarioCorrente) {
        this.funcionarioCorrente = funcionarioCorrente;
    }

    /**
     * @return the confirmarSenha
     */
    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    /**
     * @param confirmarSenha the confirmarSenha to set
     */
    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    /**
     * @return the listaFuncionarios
     */
    public ListDataModel getListaFuncionarios() {
        return listaFuncionarios;
    }

    /**
     * @param listaFuncionarios the listaFuncionarios to set
     */
    public void setListaFuncionarios(ListDataModel listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    /**
     * @return the novoFuncionario
     */
    public boolean isNovoFuncionario() {
        return novoFuncionario;
    }

    /**
     * @param novoFuncionario the novoFuncionario to set
     */
    public void setNovoFuncionario(boolean novoFuncionario) {
        this.novoFuncionario = novoFuncionario;
    }

    /**
     * @return the comboTipoFunc
     */
    public List<SelectItem> getComboTipoFunc() {
        if (comboTipoFunc == null) {
            comboTipoFunc = new ArrayList<SelectItem>(Funcionario.Tipo.values().length);
            for (Tipo tipo : Tipo.values()) {
                comboTipoFunc.add(new SelectItem(tipo.ordinal(), tipo.toString()));
            }
        }
        return comboTipoFunc;
    }

    /**
     * @param comboTipoFunc the comboTipoFunc to set
     */
    public void setComboTipoFunc(List<SelectItem> comboTipoFunc) {
        this.comboTipoFunc = comboTipoFunc;
    }

    /**
     * @return the tipoFunc
     */
    public int getTipoFunc() {
        return tipoFunc;
    }

    /**
     * @param tipoFunc the tipoFunc to set
     */
    public void setTipoFunc(int tipoFunc) {
        this.tipoFunc = tipoFunc;
    }

    /**
     * @return the senhaAntiga
     */
    public String getSenhaAntiga() {
        return senhaAntiga;
    }

    /**
     * @param senhaAntiga the senhaAntiga to set
     */
    public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
    }

    /**
     * @return the novaSenha
     */
    public String getNovaSenha() {
        return novaSenha;
    }

    /**
     * @param novaSenha the novaSenha to set
     */
    public void setNovaSenha(String novaSenha) {
        this.novaSenha = novaSenha;
    }
}
