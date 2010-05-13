package br.com.iduff.DAO;

import br.com.iduff.modelo.Funcionario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class FuncionarioDao  {

    private final Session session;

    public FuncionarioDao(Session session) {
        this.session = session;
    }

    public void adicionar(Funcionario funcionario) {
        
        session.save(funcionario);
    }

    public void remover(Funcionario funcionario) {
        session.delete(session.get(Funcionario.class, funcionario.getId()));
    }

    public void atualiza(Funcionario funcionario) {
        session.merge(funcionario);
    }

    public List<Funcionario> listarTudo() {
        return session.createQuery("Select f from Funcionario f").list();
    }

    public Funcionario procurarPorUsuario(String usuario){
        return  (Funcionario) session.createQuery("Select f from Funcionario f where f.usuario = '" + usuario + "'").uniqueResult();

    }

    public Funcionario procurarPorCpf(String cpf){
        return  (Funcionario) session.createQuery("Select f from Funcionario f where f.CPF= '" + cpf + "'").uniqueResult();
    }

    public Funcionario procurar(int id) {
        return (Funcionario) session.load(Funcionario.class, id);
    }
}

