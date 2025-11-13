package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Saude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String usoMedicamentos;
    private String gastosMedicamentos;
    private String valorMedioGastos;
    private String alergiaMedicamentos;
    private String alergiaInsetos;
    private String alergiaProdutosLimpeza;
    private String historicoClinico;
    private String tipoParto;
    private String diagnosticos;
    private String profissionaisAtuantes;
    private String frequentaInstituicao;
    private String terapias;
    private String medicoEspecialista;
    private Boolean possuiPessoaComDeficiencia;
    private String deficienciaFamiliar;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    @JsonBackReference
    private Aluno aluno;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsoMedicamentos() { return usoMedicamentos; }
    public void setUsoMedicamentos(String usoMedicamentos) { this.usoMedicamentos = usoMedicamentos; }

    public String getGastosMedicamentos() { return gastosMedicamentos; }
    public void setGastosMedicamentos(String gastosMedicamentos) { this.gastosMedicamentos = gastosMedicamentos; }

    public String getValorMedioGastos() { return valorMedioGastos; }
    public void setValorMedioGastos(String valorMedioGastos) { this.valorMedioGastos = valorMedioGastos; }

    public String getAlergiaMedicamentos() { return alergiaMedicamentos; }
    public void setAlergiaMedicamentos(String alergiaMedicamentos) { this.alergiaMedicamentos = alergiaMedicamentos; }

    public String getAlergiaInsetos() { return alergiaInsetos; }
    public void setAlergiaInsetos(String alergiaInsetos) { this.alergiaInsetos = alergiaInsetos; }

    public String getAlergiaProdutosLimpeza() { return alergiaProdutosLimpeza; }
    public void setAlergiaProdutosLimpeza(String alergiaProdutosLimpeza) { this.alergiaProdutosLimpeza = alergiaProdutosLimpeza; }

    public String getHistoricoClinico() { return historicoClinico; }
    public void setHistoricoClinico(String historicoClinico) { this.historicoClinico = historicoClinico; }

    public String getTipoParto() { return tipoParto; }
    public void setTipoParto(String tipoParto) { this.tipoParto = tipoParto; }

    public String getDiagnosticos() { return diagnosticos; }
    public void setDiagnosticos(String diagnosticos) { this.diagnosticos = diagnosticos; }

    public String getProfissionaisAtuantes() { return profissionaisAtuantes; }
    public void setProfissionaisAtuantes(String profissionaisAtuantes) { this.profissionaisAtuantes = profissionaisAtuantes; }

    public String getFrequentaInstituicao() { return frequentaInstituicao; }
    public void setFrequentaInstituicao(String frequentaInstituicao) { this.frequentaInstituicao = frequentaInstituicao; }

    public String getTerapias() { return terapias; }
    public void setTerapias(String terapias) { this.terapias = terapias; }

    public String getMedicoEspecialista() { return medicoEspecialista; }
    public void setMedicoEspecialista(String medicoEspecialista) { this.medicoEspecialista = medicoEspecialista; }

    public Boolean getPossuiPessoaComDeficiencia() { return possuiPessoaComDeficiencia; }
    public void setPossuiPessoaComDeficiencia(Boolean possuiPessoaComDeficiencia) { this.possuiPessoaComDeficiencia = possuiPessoaComDeficiencia; }

    public String getDeficienciaFamiliar() { return deficienciaFamiliar; }
    public void setDeficienciaFamiliar(String deficienciaFamiliar) { this.deficienciaFamiliar = deficienciaFamiliar; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

}

