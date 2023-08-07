package com.matheusprata.escola.turma.application.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Tag(name = "Turma", description = "Turma APIs")
@RequestMapping("/v1/turma")
public interface TurmaApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    TurmaIdResponse saveTurma(@Valid @RequestBody TurmaRequest request);
}
