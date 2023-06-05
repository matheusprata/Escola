package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoIdResponse;
import com.matheusprata.escola.aluno.application.api.AlunoRequest;

public interface AlunoService {
    AlunoIdResponse saveAluno(AlunoRequest alunoRequest);
}
