/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author user
 */
@NamedQueries({
    @NamedQuery(name = "Usuario.getPorLoginSenha",
    query = "select usr from Usuario usr where usr.login = ? and usr.senha = ?")

})
@Entity
@Table(name="Usuario")
@SequenceGenerator(name = "Sequencia", sequenceName = "usuario_seq")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Sequencia")
    private Long id;
    @Column(nullable=false)
    private String login;
    @Column(nullable=false)
    private String nome;
    @Column(nullable=false)
    private String senha;
    @Column(nullable=false)
    private String email;
    private String telefone;//TO DO
    private String endereco;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
