package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.turma.application.api.TurmaIdResponse;
import com.matheusprata.escola.turma.application.api.TurmaListResponse;
import com.matheusprata.escola.turma.application.api.TurmaRequest;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<TurmaListResponse> getAllTurmas() {
        log.info("[inicia] TurmaApplicationService - getAllTurmas");
        List<Turma> turmas = turmaRepository.getAllTurmas();
        log.info("[finaliza] TurmaApplicationService - getAllTurmas");
        return TurmaListResponse.converte(turmas);
    }
}
