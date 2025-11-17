package com.ama.form.dto.SituacaoHabitacional;

public record CreateSituacaoHabitacionalDTO(
    Long id,
        Integer numeroComodos,
        String possuiPasseLivre,
        String cartaoEstacionamentoDeficiente,
        String bensPossuidos,
        Boolean profissionalDomestico,
        String rendaFamiliar,
        String beneficiosSociais,
        Integer pessoasRecebemBpc
) {}
