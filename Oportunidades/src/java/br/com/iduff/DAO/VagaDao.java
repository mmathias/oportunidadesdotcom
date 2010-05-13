package br.com.iduff.DAO;

import br.com.iduff.modelo.Vaga;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class VagaDao {

    private final Session session;

    public VagaDao(Session session) {
        this.session = session;
    }

    public void adicionar(Vaga vaga) {
        session.save(vaga);
    }

    public void remover(Vaga vaga) {
        session.delete(session.get(Vaga.class, vaga.getId()));
    }

    public void atualiza(Vaga vaga) {
        session.update(vaga);
    }

    public List<Vaga> listarTudo() {
        return session.createQuery("Select c from Vaga c").list();
    }

    public Vaga procurar(int id) {
        return (Vaga) session.load(Vaga.class, id);
    }
}



