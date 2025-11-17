package com.ama.form.dto.Endereco;

public record CreateEnderecoDTO(
    Long id,
    String logradouro,
    String bairro,
    String cep,
    String referencia,
    String caracteristicas,
    String situacao,
    String tipoConstrucao,
    String tipoImovel,
    String abastecimentoAgua,
    String iluminacao,
    String saneamento,
    String banheiro,
    String destinoLixo
) {}
