/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.oportunidades.modelo;

/**
 *
 * @author user
 */
public class Profissional {

    private String descricaoCargo;
    private String[] projetosAtuacao;

    /**
     * @return the descricaoCargo
     */
    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    /**
     * @param descricaoCargo the descricaoCargo to set
     */
    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    /**
     * @return the projetosAtuacao
     */
    public String[] getProjetosAtuacao() {
        return projetosAtuacao;
    }

    /**
     * @param projetosAtuacao the projetosAtuacao to set
     */
    public void setProjetosAtuacao(String[] projetosAtuacao) {
        this.projetosAtuacao = projetosAtuacao;
    }

    
}
