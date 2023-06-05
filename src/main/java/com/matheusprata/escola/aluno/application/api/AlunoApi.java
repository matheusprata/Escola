package com.matheusprata.escola.aluno.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Aluno", description = "Aluno APIs")
@RequestMapping("/v1/aluno")
public interface AlunoApi{

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AlunoIdResponse saveAluno(@Valid @RequestBody AlunoRequest alunoRequest);
}
