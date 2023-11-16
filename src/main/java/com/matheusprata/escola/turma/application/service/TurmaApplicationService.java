package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.turma.application.api.TurmaIdResponse;
import com.matheusprata.escola.turma.application.api.TurmaRequest;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class TurmaApplicationService implements TurmaService{
    private final TurmaRepository turmaRepository;

    @Override
    public TurmaIdResponse saveTurma(TurmaRequest turmaRequest) {
        log.info("[inicia] TurmaApplicationService - saveTurma");
        Turma turma = turmaRepository.saveTurma(new Turma(turmaRequest));
        log.info("[finaliza] TurmaApplicationService - saveTurma");
        return TurmaIdResponse.builder().idTurma(turma.getIdTurma()).build();
    }
}
