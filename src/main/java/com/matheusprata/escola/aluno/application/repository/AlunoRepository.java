package com.matheusprata.escola.aluno.application.repository;

import com.matheusprata.escola.aluno.domain.Aluno;
import java.util.List;
import java.util.UUID;

public interface AlunoRepository {
    Aluno saveAluno(Aluno aluno);
    List<Aluno> getAllAlunos();
    Aluno findByCpf(String cpf);
    Aluno getOneAluno(UUID idAluno);
}