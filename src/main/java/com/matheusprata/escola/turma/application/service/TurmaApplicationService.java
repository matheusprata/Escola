package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.turma.application.api.*;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
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

    @Override
    public List<TurmaListResponse> findAllByAno(Integer ano) {
        log.info("[inicia] TurmaApplicationService - getAno");
        List<Turma> turmas = turmaRepository.findAllByAno(ano);
        log.info("[finaliza] TurmaApplicationService - getAno");
        return TurmaListResponse.converte(turmas);
    }

    @Override
    public void updateTurma(Long idTurma, TurmaAlteracaoRequest turmaAlteracaoRequest) {
        log.info("[inicia] TurmaApplicationService - updateTurma");
        Turma turma = turmaRepository.findById(idTurma)
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Turma não encontrada!"));
        turma.update(turmaAlteracaoRequest);
        turmaRepository.saveTurma(turma);
        log.info("[finaliza] TurmaApplicationService - updateTurma");
    }

    @Override
    public TurmaDetalhadoResponse getById(Long idTurma) {
        log.info("[inicia] TurmaApplicationService - updateTurma");
        Turma turma = turmaRepository.findById(idTurma)
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Turma não encontrada!"));
        log.info("[finaliza] TurmaApplicationService - updateTurma");
        return new TurmaDetalhadoResponse(turma);
    }
}