package com.matheusprata.escola.turma.application.service;

import com.matheusprata.escola.turma.application.api.TurmaIdResponse;
import com.matheusprata.escola.turma.application.api.TurmaRequest;

public interface TurmaService {
    TurmaIdResponse saveTurma(TurmaRequest turmaRequest);
}
