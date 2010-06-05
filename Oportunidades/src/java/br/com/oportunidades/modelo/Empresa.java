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
public class Empresa extends Usuario{

    private String CNPJ;
    private String descricao;
    private List<Oportunidade> oportunidades;


    public List<Oportunidade> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(List<Oportunidade> oportunidades) {
        this.oportunidades = oportunidades;
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Metodo para adicionar uma nova oportunidade relacionada a uma empresa
     * 
     * @param descricao
     * @param numVagas
     * @param numReservas
     */
    public void adicionarOportunidade(String descricao, int numVagas, int numReservas ){
        Oportunidade oportunidade = new Oportunidade();

        oportunidade.setDescricao(descricao);
        oportunidade.setNumVagas(numVagas);
        oportunidade.setNumReservas(numReservas);

        oportunidade.setEmpresa(this);

        this.oportunidades.add(oportunidade);
    }

    /**
     * remove uma oportunidade
     *
     * @param oportunidade
     */
    public void removerOportunidade(Oportunidade oportunidade){
        this.oportunidades.remove(oportunidade);
    }


}
