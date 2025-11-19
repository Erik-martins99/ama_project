package com.ama.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ama.form.dto.Aluno.CreateAlunoDTO;
import com.ama.form.model.Aluno;
import com.ama.form.service.AlunoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/aluno")
@Tag(name = "Gerenciamento de alunos", description = "APIs para o cadastro de novos alunos no AMA")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @Operation(summary = "Criar Aluno", description = "Registra um novo aluno no sistema com base no formulario")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Student created with successfully",
                    content = @Content(schema = @Schema(implementation = CreateAlunoDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody CreateAlunoDTO dto) {
        Aluno aluno = alunoService.criarAluno(dto);
        return ResponseEntity.ok(aluno);
    }

    @Operation(summary = "Alunos", description = "Retorna todos os alunos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Students find successfully",
                    content = @Content(schema = @Schema(implementation = CreateAlunoDTO.class))),
            @ApiResponse(responseCode = "400", description = "Invalid request data",
                    content = @Content(schema = @Schema()))
    })
    @GetMapping
    public ResponseEntity<List<Aluno>> listarTodos() {
        return ResponseEntity.ok(alunoService.findAll());
    }

    @Operation(summary = "Aluno", description = "Retorna um aluno pelo seu ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Student find successfully",
                    content = @Content(schema = @Schema(implementation = CreateAlunoDTO.class))),
            @ApiResponse(responseCode = "404", description = "Student not found",
                    content = @Content(schema = @Schema()))
    })
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        return alunoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Atualizar Aluno", description = "Atualiza os dados de um aluno pelo seu ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Student updeted with successfully",
                    content = @Content(schema = @Schema(implementation = CreateAlunoDTO.class))),
            @ApiResponse(responseCode = "404", description = "Student not found",
                    content = @Content(schema = @Schema()))
    })
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable Long id,
                                           @RequestBody CreateAlunoDTO dto) {

        Aluno atualizado = alunoService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }

    @Operation(summary = "Deleta Aluno", description = "Deleta um aluno pelo seu ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Student deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Student not found",
                    content = @Content(schema = @Schema()))
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        alunoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
