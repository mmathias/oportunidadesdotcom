package br.com.oportunidades.DAO;

import br.com.oportunidades.modelo.Idioma;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class IdiomaDao {

    private final Session session;

    public IdiomaDao(Session session) {
        this.session = session;
    }

    public void adicionar(Idioma idioma) {
        session.save(idioma);
    }

    public void remover(Idioma idioma) {
        session.delete(session.get(Idioma.class, idioma.getId()));
    }

    public void atualiza(Idioma idioma) {
        session.update(idioma);
    }

    public List<Idioma> listarTudo() {
        return session.createQuery("Select c from Idioma c").list();
    }

    public Idioma procurar(int id) {
        return (Idioma) session.load(Idioma.class, id);
    }
}


