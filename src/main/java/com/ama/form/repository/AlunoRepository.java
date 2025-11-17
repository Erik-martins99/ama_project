package com.ama.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ama.form.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
