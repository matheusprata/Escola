package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoIdResponse;
import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import com.matheusprata.escola.aluno.application.api.AlunoRequest;
import java.util.List;

public interface AlunoService {
    AlunoIdResponse saveAluno(AlunoRequest alunoRequest);
    List<AlunoListResponse> getAllAlunos();
}