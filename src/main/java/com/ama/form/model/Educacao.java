package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Educacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoEscola;
    private String nomeEscola;
    private String turno;
    private String matricula;
    private Boolean possuiPAE;
    private String escolaridadeMae;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    private Aluno aluno;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipoEscola() { return tipoEscola; }
    public void setTipoEscola(String tipoEscola) { this.tipoEscola = tipoEscola; }

    public String getNomeEscola() { return nomeEscola; }
    public void setNomeEscola(String nomeEscola) { this.nomeEscola = nomeEscola; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public Boolean getPossuiPAE() { return possuiPAE; }
    public void setPossuiPAE(Boolean possuiPAE) { this.possuiPAE = possuiPAE; }

    public String getEscolaridadeMae() { return escolaridadeMae; }
    public void setEscolaridadeMae(String escolaridadeMae) { this.escolaridadeMae = escolaridadeMae; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

}
