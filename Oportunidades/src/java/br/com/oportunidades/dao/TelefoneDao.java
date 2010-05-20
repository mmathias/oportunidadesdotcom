package br.com.oportunidades.dao;

import br.com.oportunidades.modelo.Telefone;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class TelefoneDao {

    private final Session session;

    public TelefoneDao(Session session) {
        this.session = session;
    }

    public void adicionar(Telefone telefone) {
        session.save(telefone);
    }

    public void remover(Telefone telefone) {
        session.delete(session.get(Telefone.class, telefone.getId()));
    }

    public void atualiza(Telefone telefone) {
        session.update(telefone);
    }

    public List<Telefone> listarTudo() {
        return session.createQuery("Select c from Telefone c").list();
    }

    public Telefone procurar(int id) {
        return (Telefone) session.load(Telefone.class, id);
    }
}



