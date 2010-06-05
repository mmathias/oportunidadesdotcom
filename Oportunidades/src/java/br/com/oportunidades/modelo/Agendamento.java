/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.modelo;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author user
 */
class Agendamento {
    private Calendar dataInicio;
    private Calendar dataFim;
    private int numCandidatos;
    private int maxCandidatos;
    private List<Candidato> candidatos;

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getMaxCandidatos() {
        return maxCandidatos;
    }

    public void setMaxCandidatos(int maxCandidatos) {
        this.maxCandidatos = maxCandidatos;
    }

    public int getNumCandidatos() {
        return numCandidatos;
    }

    public void setNumCandidatos(int numCandidatos) {
        this.numCandidatos = numCandidatos;
    }


}
