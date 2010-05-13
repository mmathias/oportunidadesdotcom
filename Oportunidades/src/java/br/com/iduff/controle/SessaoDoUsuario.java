/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iduff.controle;

import br.com.iduff.DAO.DaoFactory;
import br.com.iduff.DAO.FuncionarioDao;
import br.com.iduff.modelo.Funcionario;


/**
 *
 * @author user
 */
public class SessaoDoUsuario {

    public static final String PAGINA_HOME = "def:home";
    public static final String PAGINA_ERRO = "def:erro";
    private Funcionario funcionarioLogado;
    private boolean rh;
    private String senha;
    private String usuario;
    private DaoFactory factory;
    private FuncionarioDao funcionarioDao;

    public String autenticarFuncionario() {
        factory = new DaoFactory();
        funcionarioDao = factory.getFuncionarioDao();
        Funcionario func = funcionarioDao.procurarPorUsuario(getUsuario());
        if (func == null) {
            return PAGINA_ERRO;
        }
        if (getSenha().equals(func.getSenha())) {
            funcionarioLogado = func;
            return PAGINA_HOME;
        } else {
            return PAGINA_ERRO;//TODO retornar ERRO
        }
    }

    /**
     * @return the funcionarioLogado
     */
    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    /**
     * @param funcionarioLogado the funcionarioLogado to set
     */
    public void setFuncionarioLogado(Funcionario funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }

    /**
     * @return the rh fazer para os outros 2 tipos
     */
    public boolean isRh() {
        rh = false;
        if (funcionarioLogado != null && (funcionarioLogado.getEspecificacao() == Funcionario.Tipo.RH )) {
            rh = true;
        }
        return rh;
    }

    /**
     * @param rh the rh to set
     */
    public void setRh(boolean rh) {
        this.rh = rh;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the factory
     */
    public DaoFactory getFactory() {
        return factory;
    }

    /**
     * @param factory the factory to set
     */
    public void setFactory(DaoFactory factory) {
        this.factory = factory;
    }

    /**
     * @return the funcionarioDao
     */
    public FuncionarioDao getFuncionarioDao() {
        return funcionarioDao;
    }

    /**
     * @param funcionarioDao the funcionarioDao to set
     */
    public void setFuncionarioDao(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }
}
