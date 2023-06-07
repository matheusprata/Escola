package com.matheusprata.escola.responsavel.application.api;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@Tag(name = "Responsavel", description = "Responsavel APIs")
@RequestMapping("/v1/responsavel")
public interface ResponsavelApi {

    @PostMapping("/{idAluno}")
    @ResponseStatus(code = HttpStatus.CREATED)
    ResponsavelResponse saveResponsavel(@PathVariable UUID idAluno, @Valid @RequestBody ResponsavelRequest responsavelRequest);
}