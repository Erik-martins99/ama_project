package com.ama.form.dto.Educacao;

public record CreateEducacaoDTO(
    Long id,
    String tipoEscola,
    String nomeEscola,
    String turno,
    String matricula,
    Boolean possuiPAE,
    String escolaridadeMae
) {}
