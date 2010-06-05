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
class Perfil {

    private AreaDeAtividade areaDeAtividade;
    private TipoDeOportunidade tipoDeOportunidade;

    public AreaDeAtividade getAreaDeAtividade() {
        return areaDeAtividade;
    }

    public void setAreaDeAtividade(AreaDeAtividade areaDeAtividade) {
        this.areaDeAtividade = areaDeAtividade;
    }

    public TipoDeOportunidade getTipoDeOportunidade() {
        return tipoDeOportunidade;
    }

    public void setTipoDeOportunidade(TipoDeOportunidade tipoDeOportunidade) {
        this.tipoDeOportunidade = tipoDeOportunidade;
    }
    private Candidato candidato;
    private List<Oportunidade> oportunidades;

    public List<Oportunidade> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(List<Oportunidade> oportunidades) {
        this.oportunidades = oportunidades;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

}
