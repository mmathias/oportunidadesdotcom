/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iduff.DAO;

import br.com.iduff.modelo.Curriculo;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class CurriculoDao {

    private final Session session;

    public CurriculoDao(Session session) {
        this.session = session;
    }

    public void adicionar(Curriculo curriculo) {
        session.save(curriculo);
    }

    public void remover(Curriculo curriculo) {
        session.delete(session.get(Curriculo.class, curriculo.getId()));
    }

    public void atualiza(Curriculo curriculo) {
        session.update(curriculo);
    }

    public List<Curriculo> listarTudo() {
        return session.createQuery("Select c from Curriculo c").list();
    }

    public Curriculo procurar(int id) {
        return (Curriculo) session.load(Curriculo.class, id);
    }
}

