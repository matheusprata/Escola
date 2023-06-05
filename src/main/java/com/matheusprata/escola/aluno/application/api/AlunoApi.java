package com.matheusprata.escola.aluno.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.UUID;

@Tag(name = "Aluno", description = "Aluno APIs")
@RequestMapping("/v1/aluno")
public interface AlunoApi{

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AlunoIdResponse saveAluno(@Valid @RequestBody AlunoRequest alunoRequest);

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    List<AlunoListResponse> getAllAlunos();

    @GetMapping(value = "/cpf")
    @ResponseStatus(code = HttpStatus.OK)
    AlunoResponse getByCpf(@RequestParam String cpf);
}