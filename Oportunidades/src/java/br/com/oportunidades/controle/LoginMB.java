/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.controle;

import br.com.oportunidades.modelo.Pessoa;
import br.com.oportunidades.service.LoginService;
import javax.faces.model.ListDataModel;

/**
 *
 * @author user
 */
public class LoginMB {
    private LoginService loginService = new LoginService();
    private Pessoa pessoa;
    private String usuario;
    private String senha;
    private ListDataModel pessoas;

    public String validar(){
        setPessoa(new Pessoa(usuario, senha));
        
        if(loginService.buscarPessoa(getPessoa())!= null){
            setPessoas(loginService.listarPessoas());
            return "valido";
        }        
        return "invalido";
    }

    public String cadastrar(){

        loginService.inserirPessoa(pessoa);
        return "sucesso";        
    }

    public String getUsuario() {
        return usuario;
    }

    public String direcionaCadastro(){
        setPessoa(new Pessoa());
        return "cadastro";
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
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the pessoas
     */
    public ListDataModel getPessoas() {
        return pessoas;
    }

    /**
     * @param pessoas the pessoas to set
     */
    public void setPessoas(ListDataModel pessoas) {
        this.pessoas = pessoas;
    }
}
