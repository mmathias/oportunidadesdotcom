package br.com.iduff.DAO;

import br.com.iduff.modelo.Historico;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class HistoricoDao {

    private final Session session;

    public HistoricoDao(Session session) {
        this.session = session;
    }

    public void adicionar(Historico historico) {
        session.save(historico);
    }

    public void remover(Historico historico) {
        //session.delete(session.get(Historico.class, historico.getId()));
    }

    public void atualiza(Historico historico) {
        session.update(historico);
    }

    public List<Historico> listarTudo() {
        return session.createQuery("Select c from Historico c").list();
    }

    public Historico procurar(int id) {
        return (Historico) session.load(Historico.class, id);
    }
}

