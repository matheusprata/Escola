package com.matheusprata.escola.professor.application.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@Tag(name = "Professor", description = "Professor APIs")
@RequestMapping("/v1/professor")
public interface ProfessorApi {

    @PostMapping(value = "/{idTurma}")
    @ResponseStatus(code = HttpStatus.CREATED)
    ProfessorResponse saveProfessor(@PathVariable Long idTurma,
                                      @Valid @RequestBody ProfessorRequest professorRequest);

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    List<ProfessorListResponse> getAllProfessores();

    @GetMapping(value = "/{idProfessor}")
    @ResponseStatus(code = HttpStatus.OK)
    ProfessorResponse getOneProfessor(@PathVariable UUID idProfessor);

    @PatchMapping(value = "/{idProfessor}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void updateProfessor(@PathVariable UUID idProfessor,
                         @Valid @RequestBody ProfessorAlteracaoRequest professorAlteracaoRequest);
}