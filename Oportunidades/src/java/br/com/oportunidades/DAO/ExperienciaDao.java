package br.com.oportunidades.DAO;

import br.com.oportunidades.modelo.Experiencia;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class ExperienciaDao {

    private final Session session;

    public ExperienciaDao(Session session) {
        this.session = session;
    }

    public void adicionar(Experiencia experiencia) {
        session.save(experiencia);
    }

    public void remover(Experiencia experiencia) {
        session.delete(session.get(Experiencia.class, experiencia.getId()));
    }

    public void atualiza(Experiencia experiencia) {
        session.update(experiencia);
    }

    public List<Experiencia> listarTudo() {
        return session.createQuery("Select c from Experiencia c").list();
    }

    public Experiencia procurar(int id) {
        return (Experiencia) session.load(Experiencia.class, id);
    }
}

