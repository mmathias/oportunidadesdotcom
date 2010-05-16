package br.com.oportunidades.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FacadeJPA {
    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploWeb");
    
    private static FacadeJPA instance = null;
    
    public static FacadeJPA getInstance() {
        if(instance == null) {
            instance = new FacadeJPA();
        }
        return instance;
    }

    /** Creates a new instance of FacadeJPA */
    private FacadeJPA() {
    }
}
