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
public class Candidato extends Usuario {

    private String CPF;
    private Calendar dataNascimento;
    private String RG;
    private Sexo sexo;
    private String estadoCivil;
    private String possivelViajar;
    private int filhos;
    //private String cidadeInteresse;
    private String nacionalidade;
    private boolean desejaSerNotificadoPorEmail;
    private List<Agendamento> agendamentos;
    private List<Candidatura> candidaturas;
    private List<Perfil> perfis;
    private Curriculo curriculo;

    

    public List<Candidatura> getCandidaturas() {
        return candidaturas;
    }

    public void setCandidaturas(List<Candidatura> candidaturas) {
        this.candidaturas = candidaturas;
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isDesejaSerNotificadoPorEmail() {
        return desejaSerNotificadoPorEmail;
    }

    public void setDesejaSerNotificadoPorEmail(boolean desejaSerNotificadoPorEmail) {
        this.desejaSerNotificadoPorEmail = desejaSerNotificadoPorEmail;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPossivelViajar() {
        return possivelViajar;
    }

    public void setPossivelViajar(String possivelViajar) {
        this.possivelViajar = possivelViajar;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the curriculo
     */
    public Curriculo getCurriculo() {
        return curriculo;
    }

    /**
     * @param curriculo the curriculo to set
     */
    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

    public boolean agendarEntrevista(Agendamento agendamento) {
        return this.agendamentos.add(agendamento);
    }

    public List<Oportunidade> buscaOportunidadesCompativeis() {
        List<Oportunidade> oportunidades = null;
        for (Perfil perfil : perfis) {
            for (Candidatura candidatura : this.candidaturas) {
                oportunidades.add(candidatura.getOportunidade());
            }
        }
        return oportunidades;
    }

    public Perfil criaPerfil(AreaDeAtividade areaDeAtividade, TipoDeOportunidade tipoDeOportunidade) {
        Perfil perfil = new Perfil();
        perfil.setAreaDeAtividade(areaDeAtividade);
        perfil.setTipoDeOportunidade(tipoDeOportunidade);
        perfil.setCandidato(this);        
        return perfil;
    }

    public boolean seCandidatar(Oportunidade oportunidade, boolean notificar) {
        Candidatura candidatura = new Candidatura();
        candidatura.setCandidato(this);
        candidatura.setNotificado(notificar);        
        candidatura.setStatus(Status.Aguardando);
        candidatura.setOportunidade(oportunidade);
        
        return this.candidaturas.add(null);
    }

}
