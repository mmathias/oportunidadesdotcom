/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaoFactory {

    private final Session session;
    private Transaction transaction;

    public DaoFactory() {
        session = HibernateUtil.getSession();
    }

    public void beginTransaction() {
        this.transaction = this.session.beginTransaction();
    }

    public void commit() {
        this.transaction.commit();
        this.transaction = null;
    }

    public boolean hasTransaction() {
        return this.transaction != null;
    }

    public void rollback() {
        this.transaction.rollback();
        this.transaction = null;
    }

    public void close() {
        this.session.close();
    }

    public EnderecoDao getEnderecoDao(){
        return new EnderecoDao(this.session);
    }

    public FuncionarioDao getFuncionarioDao(){
        return new FuncionarioDao(this.session);
    }
   
}