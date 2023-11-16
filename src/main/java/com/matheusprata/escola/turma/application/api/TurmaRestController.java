package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import com.matheusprata.escola.turma.application.service.TurmaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class TurmaRestController implements TurmaApi{
    private final TurmaService turmaService;

    @Override
    public TurmaIdResponse saveTurma(TurmaRequest turmaRequest) {
        log.info("[inicia] TurmaRestController - saveTurma");
        TurmaIdResponse saveTurma = turmaService.saveTurma(turmaRequest);
        log.info("[finaliza] TurmaRestController - saveTurma");
        return saveTurma;
    }

    @Override
    public List<TurmaListResponse> getAllTurmas() {
        log.info("[inicia] TurmaRestController - getAllTurmas");
        List<TurmaListResponse> turmas = turmaService.getAllTurmas();
        log.info("[finaliza] TurmaRestController - getAllTurmas");
        return turmas;
    }
}
