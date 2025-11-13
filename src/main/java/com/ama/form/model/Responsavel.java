package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String parentesco;
    private String telefone1;
    private String telefone2;
    private String email;
    private String rendaFamiliar;
    private String beneficiosSociais;
    private Integer pessoasRecebemBpc;
    private String convivenciaFamiliar;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    private Aluno aluno;

    public Long getId() {
         return id; 
    }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }

    public String getTelefone1() { return telefone1; }
    public void setTelefone1(String telefone1) { this.telefone1 = telefone1; }

    public String getTelefone2() { return telefone2; }
    public void setTelefone2(String telefone2) { this.telefone2 = telefone2; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRendaFamiliar() { return rendaFamiliar; }
    public void setRendaFamiliar(String rendaFamiliar) { this.rendaFamiliar = rendaFamiliar; }

    public String getBeneficiosSociais() { return beneficiosSociais; }
    public void setBeneficiosSociais(String beneficiosSociais) { this.beneficiosSociais = beneficiosSociais; }

    public Integer getPessoasRecebemBpc() { return pessoasRecebemBpc; }
    public void setPessoasRecebemBpc(Integer pessoasRecebemBpc) { this.pessoasRecebemBpc = pessoasRecebemBpc; }

    public String getConvivenciaFamiliar() { return convivenciaFamiliar; }
    public void setConvivenciaFamiliar(String convivenciaFamiliar) { this.convivenciaFamiliar = convivenciaFamiliar; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
}

