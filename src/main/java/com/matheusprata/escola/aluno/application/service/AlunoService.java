package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.*;
import java.util.List;

public interface AlunoService {
    AlunoIdResponse saveAluno(AlunoRequest alunoRequest);
    List<AlunoListResponse> getAllAlunos();
    AlunoResponse getByCpf(String cpf);
    void updateAluno(String cpf, AlunoAlteracaoRequest alunoAlteracaoRequest);
}