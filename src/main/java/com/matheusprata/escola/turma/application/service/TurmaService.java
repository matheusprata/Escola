package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.turma.application.api.TurmaIdResponse;
import com.matheusprata.escola.turma.application.api.TurmaListResponse;
import com.matheusprata.escola.turma.application.api.TurmaRequest;

import java.util.List;

public interface TurmaService {
    TurmaIdResponse saveTurma(TurmaRequest turmaRequest);
    List<TurmaListResponse> getAllTurmas();
}
