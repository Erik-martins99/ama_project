SELECT
    a.id AS aluno_id,
    a.nome AS aluno_nome,
    a.sexo,
    a.data_nascimento,

    -- ENDERECO
    e.logradouro,
    e.bairro,
    e.cep,

    -- SITUACAO HABITACIONAL
    s.numero_comodos,
    s.possui_passe_livre,
    s.renda_familiar AS renda_habitacional,

    -- SAUDE
    sa.uso_medicamentos,
    sa.historico_clinico,

    -- EDUCACAO
    ed.tipo_escola,
    ed.nome_escola,
    ed.turno,

    -- RESPONSAVEIS (pode haver vários)
    r.id AS responsavel_id,
    r.nome AS responsavel_nome,
    r.parentesco,

    -- PESSOAS AUTORIZADAS
    pa.id AS autorizada_id,
    pa.nome AS autorizada_nome,
    pa.cpf AS autorizada_cpf,

    -- PROFISSIONAIS
    pr.id AS profissional_id,
    pr.especialidade,
    pr.nome_profissional
FROM aluno a
LEFT JOIN endereco e 
    ON e.aluno_id = a.id
LEFT JOIN situacao_habitacional s 
    ON s.aluno_id = a.id
LEFT JOIN saude sa 
    ON sa.aluno_id = a.id
LEFT JOIN educacao ed
    ON ed.aluno_id = a.id
LEFT JOIN responsavel r
    ON r.aluno_id = a.id
LEFT JOIN pessoa_autorizada pa
    ON pa.aluno_id = a.id
LEFT JOIN profissional_atendimento pr
    ON pr.aluno_id = a.id

ORDER BY a.id;

