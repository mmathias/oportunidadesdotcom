/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oportunidades.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mathias
 */
@Entity
public class Login implements Serializable {

    @Id
    private int id;
    private String usuario;
    private String senha;
    private Tipo especificacao;

    public enum Tipo {

        RH, COLABORADOR, GESTOR;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tipo getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(Tipo especificacao) {
        this.especificacao = especificacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
