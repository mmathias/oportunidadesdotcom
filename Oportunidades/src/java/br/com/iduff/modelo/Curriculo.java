/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.iduff.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Mathias
 */

@Entity
public class Curriculo implements Serializable {

    @Id
    private int id;

    @ManyToOne
    private Experiencia experiencia;
    @ManyToOne
    private Escolaridade escolaridade;
    @ManyToOne
    private Idioma idioma;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    

}
