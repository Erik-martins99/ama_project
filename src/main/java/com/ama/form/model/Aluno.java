package com.ama.form.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sexo;
    private String tipoDeficiencia;
    private String sindrome;
    private String dataNascimento;
    private String nacionalidade;
    private String naturalidade;
    private String rg;
    private String cpf;
    private String cartaoSUS;
    private String planoSaude;
    private String ciptea;
    private Integer anoIngresso;
    private String formaIngresso;
    private String meioTransporte;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Endereco endereco;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private SituacaoHabitacional situacaoHabitacional;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Saude saude;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Educacao educacao;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Responsavel> responsaveis;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<PessoaAutorizada> pessoasAutorizadas;

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProfissionalAtendimento> profissionais;


    public Long getId() { 
        return id; 
    }

    public void setId(Long id) {
        this.id = id; 
    }

    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getSexo() { 
        return sexo; 
    }
    
    public void setSexo(String sexo) { 
        this.sexo = sexo; 
    }

    public String getTipoDeficiencia() { 
        return tipoDeficiencia; 
    }

    public void setTipoDeficiencia(String tipoDeficiencia) { 
        this.tipoDeficiencia = tipoDeficiencia; 
    }

    public String getSindrome() { 
        return sindrome; 
    }
    
    public void setSindrome(String sindrome) { 
        this.sindrome = sindrome; 
    }

    public String getDataNascimento() { 
        return dataNascimento; 
    }
    
    public void setDataNascimento(String dataNascimento) { 
        this.dataNascimento = dataNascimento; 
    }

    public String getNacionalidade() { 
        return nacionalidade; 
    }

    public void setNacionalidade(String nacionalidade) { 
        this.nacionalidade = nacionalidade; 
    }

    public String getNaturalidade() { 
        return naturalidade; 
    }

    public void setNaturalidade(String naturalidade) { 
        this.naturalidade = naturalidade; 
    }

    public String getRg() { 
        return rg; 
    }

    public void setRg(String rg) { 
        this.rg = rg; 
    }

    public String getCpf() { 
        return cpf; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public String getCartaoSUS() { 
        return cartaoSUS; 
    }

    public void setCartaoSUS(String cartaoSUS) { 
        this.cartaoSUS = cartaoSUS; 
    }

    public String getPlanoSaude() { 
        return planoSaude; 
    }

    public void setPlanoSaude(String planoSaude) { 
        this.planoSaude = planoSaude; 
    }

    public String getCiptea() { 
        return ciptea; 
    }

    public void setCiptea(String ciptea) { 
        this.ciptea = ciptea; 
    }

    public Integer getAnoIngresso() { 
        return anoIngresso; 
    }

    public void setAnoIngresso(Integer anoIngresso) { 
        this.anoIngresso = anoIngresso; 
    }

    public String getFormaIngresso() { 
        return formaIngresso; 
    }

    public void setFormaIngresso(String formaIngresso) { 
        this.formaIngresso = formaIngresso; 
    }

    public String getMeioTransporte() { 
        return meioTransporte; 
    }

    public void setMeioTransporte(String meioTransporte) { 
        this.meioTransporte = meioTransporte; 
    }

    public Endereco getEndereco() { 
        return endereco; 
    }

    public void setEndereco(Endereco endereco) { 
        this.endereco = endereco; 
    }

    public SituacaoHabitacional getSituacaoHabitacional() { 
        return situacaoHabitacional; 
    }

    public void setSituacaoHabitacional(SituacaoHabitacional situacaoHabitacional) { 
        this.situacaoHabitacional = situacaoHabitacional; 
    }

    public Saude getSaude() { 
        return saude; 
    }

    public void setSaude(Saude saude) { 
        this.saude = saude; 
    }

    public Educacao getEducacao() { 
        return educacao; 
    }

    public void setEducacao(Educacao educacao) { 
        this.educacao = educacao; 
    }

    public List<Responsavel> getResponsaveis() { 
        return responsaveis; 
    }

    public void setResponsaveis(List<Responsavel> responsaveis) { 
        this.responsaveis = responsaveis; 
    }

    public List<PessoaAutorizada> getPessoasAutorizadas() { 
        return pessoasAutorizadas; 
    }

    public void setPessoasAutorizadas(List<PessoaAutorizada> pessoasAutorizadas) { 
        this.pessoasAutorizadas = pessoasAutorizadas; 
    }

    public List<ProfissionalAtendimento> getProfissionais() { 
        return profissionais; 
    }

    public void setProfissionais(List<ProfissionalAtendimento> profissionais) { 
        this.profissionais = profissionais; 
    }

}


