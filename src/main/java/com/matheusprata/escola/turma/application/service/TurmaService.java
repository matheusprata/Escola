package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.turma.application.api.request.TurmaAlteracaoRequest;
import com.matheusprata.escola.turma.application.api.request.TurmaRequest;
import com.matheusprata.escola.turma.application.api.response.TurmaDetalhadoResponse;
import com.matheusprata.escola.turma.application.api.response.TurmaIdResponse;
import com.matheusprata.escola.turma.application.api.response.TurmaListResponse;

import java.util.List;

public interface TurmaService {
    TurmaIdResponse saveTurma(TurmaRequest turmaRequest);
    List<TurmaListResponse> getAllTurmas();
    List<TurmaListResponse> findAllByAno(Integer ano);
    void updateTurma(Long idTurma, TurmaAlteracaoRequest turmaAlteracaoRequest);
    TurmaDetalhadoResponse getById(Long idTurma);
}