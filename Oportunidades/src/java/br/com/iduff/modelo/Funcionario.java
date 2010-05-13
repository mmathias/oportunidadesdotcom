package br.com.iduff.modelo;

import java.util.Calendar;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario implements Serializable {

    @Id
    private int id;
    private String matricula;
    private String nome;
    private String identidade;
    private String pis;
    @OneToOne(cascade=CascadeType.ALL)
    private Endereco endereco;
    @OneToOne(cascade=CascadeType.ALL)
    private Telefone telefones;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataNascimento;
    private String CPF;
    private String carteiraTrabalho;
    private String tituloEleitor;
    private String funcaoExercida;
    private String localTrabalho;
    private String sindicato;
    private String usuario;
    private String senha;
    private Tipo especificacao;

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the especificacao
     */
    public Tipo getEspecificacao() {
        return especificacao;
    }

    /**
     * @param especificacao the especificacao to set
     */
    public void setEspecificacao(Tipo especificacao) {
        this.especificacao = especificacao;
    }

    public enum Tipo {

        RH, COLABORADOR, GESTOR;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }
    private Integer horaPorDia;//Horas de trabalho
    private Integer bancoDeHoras;//Horas a mais

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFuncaoExercida() {
        return funcaoExercida;
    }

    public void setFuncaoExercida(String funcaoExercida) {
        this.funcaoExercida = funcaoExercida;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }

    public Telefone getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefones) {
        this.telefones = telefones;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    /**
     * @return the horaPorDia
     */
    public Integer getHoraPorDia() {
        return horaPorDia;
    }

    /**
     * @param horaPorDia the horaPorDia to set
     */
    public void setHoraPorDia(Integer horaPorDia) {
        this.horaPorDia = horaPorDia;
    }

    /**
     * @return the bancoDeHoras
     */
    public Integer getBancoDeHoras() {
        return bancoDeHoras;
    }

    /**
     * @param bancoDeHoras the bancoDeHoras to set
     */
    public void setBancoDeHoras(Integer bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }
}
