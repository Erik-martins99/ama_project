INSERT INTO saude (
    id, aluno_id, uso_medicamentos, gastos_medicamentos,
    valor_medio_gastos, alergia_medicamentos, alergia_insetos,
    alergia_produtos_limpeza, historico_clinico, tipo_parto,
    diagnosticos, profissionais_atuantes, frequenta_instituicao,
    terapias, medico_especialista, possui_pessoa_com_deficiencia,
    deficiencia_familiar
) VALUES (
    1, 1,
    'Risperidona 1mg/dia', 'Sim', '150.00',
    'Nenhuma', 'Não', 'Água sanitária',
    'Histórico de acompanhamento neurológico desde os 4 anos',
    'Cesariana',
    'Autismo confirmado aos 4 anos', 'Psicóloga, Fonoaudióloga',
    'Sim - AMA Bahia',
    'Fonoaudiologia, Terapia Ocupacional',
    'Dr. João Andrade - Neuropediatra',
    false, NULL
);
