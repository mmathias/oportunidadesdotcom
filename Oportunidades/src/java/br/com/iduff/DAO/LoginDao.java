package br.com.iduff.DAO;

import br.com.iduff.modelo.Login;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class LoginDao {

    private final Session session;

    public LoginDao(Session session) {
        this.session = session;
    }

    public void adicionar(Login login) {
        session.save(login);
    }

    public void remover(Login login) {
        session.delete(session.get(Login.class, login.getId()));
    }

    public void atualiza(Login login) {
        session.update(login);
    }

    public List<Login> listarTudo() {
        return session.createQuery("Select c from Login c").list();
    }

    public Login procurar(int id) {
        return (Login) session.load(Login.class, id);
    }
}



