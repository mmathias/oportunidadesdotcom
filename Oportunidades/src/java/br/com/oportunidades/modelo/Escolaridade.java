package br.com.oportunidades.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Escolaridade implements Serializable {

    @Id
    private int id;

    private String instituicao;
    private String formacao;
    private String grau;
    
    @Temporal(TemporalType.TIMESTAMP )
    private Calendar dtConclusao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Calendar getDtConclusao() {
        return dtConclusao;
    }

    public void setDtConclusao(Calendar dtConclusao) {
        this.dtConclusao = dtConclusao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    
}
