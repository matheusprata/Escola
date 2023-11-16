package com.matheusprata.escola.turma.application.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping(value = "/{idTurma}")
    @ResponseStatus(code = HttpStatus.OK)
    TurmaDetalhadoResponse getOneTurma(@PathVariable Long idTurma);

    @GetMapping("/turma/{ano}")
    @ResponseStatus(code = HttpStatus.OK)
    List<TurmaListResponse> findAllByAno(@PathVariable Integer ano);

    @PatchMapping(value = "/{idTurma}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void updateTurma(@RequestParam Long idTurma,
                           @Valid @RequestBody TurmaAlteracaoRequest turmaAlteracaoRequest);
}