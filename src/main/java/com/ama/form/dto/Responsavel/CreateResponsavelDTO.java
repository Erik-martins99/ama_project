package com.ama.form.dto.Responsavel;

public record CreateResponsavelDTO(
    Long id,
    String nome,
    String parentesco,
    String telefone1,
    String telefone2,
    String email,
    String rendaFamiliar,
    String beneficiosSociais,
    Integer pessoasRecebemBpc,
    String convivenciaFamiliar
) {}
