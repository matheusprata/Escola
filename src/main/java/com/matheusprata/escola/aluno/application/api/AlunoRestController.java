package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.application.service.AlunoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AlunoRestController implements AlunoApi{
    private final AlunoService alunoService;

    @Override
    public AlunoIdResponse saveAluno(AlunoRequest alunoRequest) {
        log.info("[inicia] AlunoRestController - saveAluno");
        AlunoIdResponse alunoCadastrado = alunoService.saveAluno(alunoRequest);
        log.info("[finaliza] AlunoRestController - saveAluno");
        return alunoCadastrado;
    }
}
