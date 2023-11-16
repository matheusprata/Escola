package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Turma", description = "Turma APIs")
@RequestMapping("/v1/turma")
public interface TurmaApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    TurmaIdResponse saveTurma(@Valid @RequestBody TurmaRequest request);

    @GetMapping(value = "/all")
    @ResponseStatus(code = HttpStatus.OK)
    List<TurmaListResponse> getAllTurmas();
}