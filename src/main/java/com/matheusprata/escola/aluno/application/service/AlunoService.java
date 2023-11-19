package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.*;
import com.matheusprata.escola.turma.application.api.AlunoTurmaResponse;

import java.util.List;

public interface AlunoService {
    List<AlunoListResponse> getAllAlunos();
    AlunoResponse getByCpf(String cpf);
    void updateAluno(String cpf, AlunoAlteracaoRequest alunoAlteracaoRequest);
    AlunoResponse saveAluno(Long idTurma, AlunoRequest alunoRequest);
    AlunoTurmaResponse getAlunoByTurma(Long idTurma);
}