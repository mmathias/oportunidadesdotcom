package br.com.oportunidades.DAO;

import br.com.oportunidades.modelo.Escolaridade;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class EscolaridadeDao {

    private final Session session;

    public EscolaridadeDao(Session session) {
        this.session = session;
    }

    public void adicionar(Escolaridade escolaridade) {
        session.save(escolaridade);
    }

    public void remover(Escolaridade escolaridade) {
        session.delete(session.get(Escolaridade.class, escolaridade.getId()));
    }

    public void atualiza(Escolaridade escolaridade) {
        session.update(escolaridade);
    }

    public List<Escolaridade> listarTudo() {
        return session.createQuery("Select c from Escolaridade c").list();
    }

    public Escolaridade procurar(int id) {
        return (Escolaridade) session.load(Escolaridade.class, id);
    }
}

