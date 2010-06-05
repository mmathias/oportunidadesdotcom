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
public class Oportunidade {
    private int numVagas;
    private int numReservas;
    private String descricao;
    private Empresa empresa;
    private List<Agendamento> agendamentos;
    private List<InfoBasica> infoBasicas;
    

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumReservas() {
        return numReservas;
    }

    public void setNumReservas(int numReservas) {
        this.numReservas = numReservas;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public boolean addAgendamento(Calendar dataIni, Calendar dataFim, int maxCandidatos){
        Agendamento agendamento = new Agendamento();
        agendamento.setDataInicio(dataIni);
        agendamento.setDataFim(dataFim);
        agendamento.setMaxCandidatos(maxCandidatos);
        return this.agendamentos.add(agendamento);
    }

    public boolean aprovaCandidatura(Candidatura candidatura){
        return true;
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

}
