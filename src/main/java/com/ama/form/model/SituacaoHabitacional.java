package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class SituacaoHabitacional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numeroComodos;
    private String possuiPasseLivre;
    private String cartaoEstacionamentoDeficiente;
    private String bensPossuidos;
    private Boolean profissionalDomestico;
    private String rendaFamiliar;
    private String beneficiosSociais;
    private Integer pessoasRecebemBpc;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    private Aluno aluno;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getNumeroComodos() { return numeroComodos; }
    public void setNumeroComodos(Integer numeroComodos) { this.numeroComodos = numeroComodos; }

    public String getPossuiPasseLivre() { return possuiPasseLivre; }
    public void setPossuiPasseLivre(String possuiPasseLivre) { this.possuiPasseLivre = possuiPasseLivre; }

    public String getCartaoEstacionamentoDeficiente() { return cartaoEstacionamentoDeficiente; }
    public void setCartaoEstacionamentoDeficiente(String cartaoEstacionamentoDeficiente) { this.cartaoEstacionamentoDeficiente = cartaoEstacionamentoDeficiente; }

    public String getBensPossuidos() { return bensPossuidos; }
    public void setBensPossuidos(String bensPossuidos) { this.bensPossuidos = bensPossuidos; }

    public Boolean getProfissionalDomestico() { return profissionalDomestico; }
    public void setProfissionalDomestico(Boolean profissionalDomestico) { this.profissionalDomestico = profissionalDomestico; }

    public String getRendaFamiliar() { return rendaFamiliar; }
    public void setRendaFamiliar(String rendaFamiliar) { this.rendaFamiliar = rendaFamiliar; }

    public String getBeneficiosSociais() { return beneficiosSociais; }
    public void setBeneficiosSociais(String beneficiosSociais) { this.beneficiosSociais = beneficiosSociais; }

    public Integer getPessoasRecebemBpc() { return pessoasRecebemBpc; }
    public void setPessoasRecebemBpc(Integer pessoasRecebemBpc) { this.pessoasRecebemBpc = pessoasRecebemBpc; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

}

