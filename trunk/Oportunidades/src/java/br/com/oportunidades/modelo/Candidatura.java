/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.modelo;

/**
 *
 * @author user
 */
class Candidatura {

    private Status status;
    private boolean notificado;
    private Oportunidade oportunidade;
    private Candidato candidato;

    
    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Oportunidade getOportunidade() {
        return oportunidade;
    }

    public void setOportunidade(Oportunidade oportunidade) {
        this.oportunidade = oportunidade;
    }
    
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isNotificado() {
        return notificado;
    }

    public void setNotificado(boolean notificado) {
        this.notificado = notificado;
    }


}
