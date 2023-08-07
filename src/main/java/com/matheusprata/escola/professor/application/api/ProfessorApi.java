package com.matheusprata.escola.professor.application.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Tag(name = "Professor", description = "Professor APIs")
@RequestMapping("/v1/professor")
public interface ProfessorApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    ProfessorIdResponse saveProfessor(@Valid @RequestBody ProfessorRequest professorRequest);
}
