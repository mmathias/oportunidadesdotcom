/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oportunidades.DAO;

import br.com.oportunidades.modelo.Pessoa;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author user
 */
public class PessoaDAO {

    Session sessao;
    SessionFactory factory = HibernateUtil.getSessionFactory();

    public PessoaDAO() {
        sessao = factory.openSession();
    }

    public List<Pessoa> listarTodos() {
        Query busca = sessao.createQuery("select p from Pessoa p ");
        List<Pessoa> pessoas = busca.list();
        sessao.close();
        return pessoas;
    }

    public Pessoa buscarPessoa(Pessoa pessoa) {
        Query busca = sessao.createQuery("select p from Pessoa p " +
                "where p.usuario = (?) " +
                "and   p.senha = (?)");
        busca.setParameter(0, pessoa.getUsuario());
        busca.setParameter(1, pessoa.getSenha());
        Pessoa p = (Pessoa) busca.uniqueResult();
        sessao.close();
        return p;
    }

    public void inserirPessoa(Pessoa pessoa) {
        sessao.beginTransaction();
        sessao.save(pessoa);
        sessao.getTransaction().commit();
        sessao.close();
    }
}
