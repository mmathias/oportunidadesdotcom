/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oportunidades.dao;

import br.com.oportunidades.modelo.Endereco;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class EnderecoDao {

    private final Session session;

    public EnderecoDao(Session session) {
        this.session = session;
    }

    public void adicionar(Endereco endereco) {
        session.save(endereco);
    }

    public void remover(Endereco endereco) {
        session.delete(session.get(Endereco.class, endereco.getId()));
    }

    public void atualiza(Endereco endereco) {
        session.update(endereco);
    }

    public List<Endereco> listarTudo() {
        return session.createQuery("Select c from Endereco c").list();
    }

    public Endereco procurar(int id) {
        return (Endereco) session.load(Endereco.class, id);
    }
}
