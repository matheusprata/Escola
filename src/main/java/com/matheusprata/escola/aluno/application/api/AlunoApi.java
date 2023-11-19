package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.turma.application.api.AlunoTurmaResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@Tag(name = "Aluno", description = "Aluno APIs")
@RequestMapping("/v1/aluno")
public interface AlunoApi{

    @PostMapping(value = "/{idTurma}")
    @ResponseStatus(code = HttpStatus.CREATED)
    AlunoResponse saveAluno(@PathVariable Long idTurma
            ,@Valid @RequestBody AlunoRequest alunoRequest);

    @GetMapping(value = "/all")
    @ResponseStatus(code = HttpStatus.OK)
    List<AlunoListResponse> getAllAlunos();

    @GetMapping(value = "/cpf")
    @ResponseStatus(code = HttpStatus.OK)
    AlunoResponse getByCpf(@RequestParam String cpf);

    @GetMapping("/turma/{idTurma}")
    @ResponseStatus(code = HttpStatus.OK)
    AlunoTurmaResponse getAllAlunoByTurma(@PathVariable Long idTurma);

    @PatchMapping(value = "/cpf")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void updateAluno(@RequestParam String cpf,
                      @Valid @RequestBody AlunoAlteracaoRequest alunoAlteracaoRequest);
}