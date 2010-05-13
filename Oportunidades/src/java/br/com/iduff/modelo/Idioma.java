/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.iduff.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mathias
 */
@Entity
public class Idioma implements Serializable {

    @Id
    private int id;

    private String idioma;
    private String profOral;
    private String profEscrita;
    private String profLeitura;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getProfEscrita() {
        return profEscrita;
    }

    public void setProfEscrita(String profEscrita) {
        this.profEscrita = profEscrita;
    }

    public String getProfLeitura() {
        return profLeitura;
    }

    public void setProfLeitura(String profLeitura) {
        this.profLeitura = profLeitura;
    }

    public String getProfOral() {
        return profOral;
    }

    public void setProfOral(String profOral) {
        this.profOral = profOral;
    }



}
