package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.turma.application.api.*;

import java.util.List;

public interface TurmaService {
    TurmaIdResponse saveTurma(TurmaRequest turmaRequest);
    List<TurmaListResponse> getAllTurmas();
    List<TurmaListResponse> findAllByAno(Integer ano);
    void updateTurma(Long idTurma, TurmaAlteracaoRequest turmaAlteracaoRequest);
    TurmaDetalhadoResponse getById(Long idTurma);
}
