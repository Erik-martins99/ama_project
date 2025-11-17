package com.ama.form.dto.PessoaAutorizada;

public record CreatePessoaAutorizadaDTO(
    Long id,
        String nome,
        String cpf,
        String telefone
) {}
