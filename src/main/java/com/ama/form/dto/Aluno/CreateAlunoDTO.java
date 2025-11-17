package com.ama.form.dto.Aluno;

import java.util.List;

import com.ama.form.dto.Educacao.CreateEducacaoDTO;
import com.ama.form.dto.Endereco.CreateEnderecoDTO;
import com.ama.form.dto.PessoaAutorizada.CreatePessoaAutorizadaDTO;
import com.ama.form.dto.ProfissionalAtendimento.CreateProfissionalAtendimentoDTO;
import com.ama.form.dto.Responsavel.CreateResponsavelDTO;
import com.ama.form.dto.Saude.CreateSaudeDTO;
import com.ama.form.dto.SituacaoHabitacional.CreateSituacaoHabitacionalDTO;

public record CreateAlunoDTO( 
    Long id,
    String nome,
    String sexo,
    String tipoDeficiencia,
    String sindrome,
    String dataNascimento,
    String nacionalidade,
    String naturalidade,
    String rg,
    String cpf,
    String cartaoSUS,
    String planoSaude,
    String ciptea,
    Integer anoIngresso,
    String formaIngresso,
    String meioTransporte,

    CreateEnderecoDTO endereco,
    CreateSituacaoHabitacionalDTO situacaoHabitacional,
    CreateSaudeDTO saude,
    CreateEducacaoDTO educacao,

    List<CreateResponsavelDTO> responsaveis,
    List<CreatePessoaAutorizadaDTO> pessoasAutorizadas,
    List<CreateProfissionalAtendimentoDTO> profissionais
 ) {}
