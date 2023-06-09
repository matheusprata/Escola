package com.matheusprata.escola.responsavel.application.api;

import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Tag(name = "Responsavel", description = "Responsavel APIs")
@RequestMapping("/v1/responsavel")
public interface ResponsavelApi {

    @PostMapping("/{idAluno}")
    @ResponseStatus(code = HttpStatus.CREATED)
    ResponsavelResponse saveResponsavel(@PathVariable UUID idAluno, @Valid @RequestBody ResponsavelRequest responsavelRequest);

    @GetMapping("/all")
    @ResponseStatus(code = HttpStatus.OK)
    List<ResponsavelListResponse> getAllResponsaveis();
}