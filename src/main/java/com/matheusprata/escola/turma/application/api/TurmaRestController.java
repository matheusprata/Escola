package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.application.service.TurmaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<TurmaListResponse> findAllByAno(Integer ano) {
        log.info("[inicia] TurmaRestController - getAno");
        List<TurmaListResponse> turmas = turmaService.findAllByAno(ano);
        log.info("[finaliza] TurmaRestController - getAno");
        return turmas;
    }

    @Override
    public void updateTurma(Long idTurma, TurmaAlteracaoRequest turmaAlteracaoRequest) {
        log.info("[inicia] TurmaRestController - updateTurma");
        turmaService.updateTurma(idTurma, turmaAlteracaoRequest);
        log.info("[finaliza] TurmaRestController - updateTurma");
    }
}
