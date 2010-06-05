/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oportunidades.modelo;

import java.util.List;

/**
 *
 * @author user
 */
public class Curriculo {

    private List<Experiencia> experiencias;
    private List<InfoBasica> infoBasicas;
    private Candidato candidato;

    /**
     * @return the experiencias
     */
    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    /**
     * @param experiencias the experiencias to set
     */
    public void setExperiencias(List<Experiencia> experiencias) {
        this.experiencias = experiencias;
    }

    /**
     * @return the infoBasicas
     */
    public List<InfoBasica> getInfoBasicas() {
        return infoBasicas;
    }

    /**
     * @param infoBasicas the infoBasicas to set
     */
    public void setInfoBasicas(List<InfoBasica> infoBasicas) {
        this.infoBasicas = infoBasicas;
    }

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
