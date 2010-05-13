/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iduff.controle;

import br.com.iduff.DAO.DaoFactory;
import br.com.iduff.DAO.FuncionarioDao;


/**
 *
 * @author User
 */
public class PrincipalLogin {

    public static final String PAGINA_HOME = "def:home";
    public static final String PAGINA_LOGIN = "def:login";
    private String usuario;
    private String senha;
    private DaoFactory factory;
    private FuncionarioDao funcionarioDao;

    public String paginaLogin(){
        return PAGINA_LOGIN;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the factory
     */
    public DaoFactory getFactory() {
        return factory;
    }

    /**
     * @param factory the factory to set
     */
    public void setFactory(DaoFactory factory) {
        this.factory = factory;
    }

    /**
     * @return the funcionarioDao
     */
    public FuncionarioDao getFuncionarioDao() {
        return funcionarioDao;
    }

    /**
     * @param funcionarioDao the funcionarioDao to set
     */
    public void setFuncionarioDao(FuncionarioDao funcionarioDao) {
        this.funcionarioDao = funcionarioDao;
    }
}
