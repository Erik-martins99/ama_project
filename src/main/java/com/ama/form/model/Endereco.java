package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;
    private String bairro;
    private String cep;
    private String referencia;
    private String caracteristicas;
    private String situacao;
    private String tipoConstrucao;
    private String tipoImovel;
    private String abastecimentoAgua;
    private String iluminacao;
    private String saneamento;
    private String banheiro;
    private String destinoLixo;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    private Aluno aluno;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public String getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }

    public String getSituacao() { return situacao; }
    public void setSituacao(String situacao) { this.situacao = situacao; }

    public String getTipoConstrucao() { return tipoConstrucao; }
    public void setTipoConstrucao(String tipoConstrucao) { this.tipoConstrucao = tipoConstrucao; }

    public String getTipoImovel() { return tipoImovel; }
    public void setTipoImovel(String tipoImovel) { this.tipoImovel = tipoImovel; }

    public String getAbastecimentoAgua() { return abastecimentoAgua; }
    public void setAbastecimentoAgua(String abastecimentoAgua) { this.abastecimentoAgua = abastecimentoAgua; }

    public String getIluminacao() { return iluminacao; }
    public void setIluminacao(String iluminacao) { this.iluminacao = iluminacao; }

    public String getSaneamento() { return saneamento; }
    public void setSaneamento(String saneamento) { this.saneamento = saneamento; }

    public String getBanheiro() { return banheiro; }
    public void setBanheiro(String banheiro) { this.banheiro = banheiro; }

    public String getDestinoLixo() { return destinoLixo; }
    public void setDestinoLixo(String destinoLixo) { this.destinoLixo = destinoLixo; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

}

