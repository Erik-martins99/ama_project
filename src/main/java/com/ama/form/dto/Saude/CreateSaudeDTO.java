package com.ama.form.dto.Saude;

public record CreateSaudeDTO(
    Long id,
    String usoMedicamentos,
    String gastosMedicamentos,
    String valorMedioGastos,
    String alergiaMedicamentos,
    String alergiaInsetos,
    String alergiaProdutosLimpeza,
    String historicoClinico,
    String tipoParto,
    String diagnosticos,
    String profissionaisAtuantes,
    String frequentaInstituicao,
    String terapias,
    String medicoEspecialista,
    Boolean possuiPessoaComDeficiencia,
    String deficienciaFamiliar
) {}
