package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.application.service.TurmaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
