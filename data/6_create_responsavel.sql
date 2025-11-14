INSERT INTO responsavel (
    id, aluno_id, nome, parentesco, telefone1, telefone2, email,
    renda_familiar, beneficios_sociais, pessoas_recebem_bpc, convivencia_familiar
) VALUES 
(
    1, 1, 'Ana Paula Santos', 'Mãe', '71999990000',
    '71988887777', 'ana.santos@example.com', '2 salários mínimos',
    'Bolsa Família', 1, 'Mãe, Pai e Irmão'
),
(
    2, 1, 'Carlos Henrique Santos', 'Pai', '71997776666',
    NULL, 'carlos.santos@example.com', '2 salários mínimos',
    'Nenhum', 0, 'Mãe, Pai e Irmão'
);