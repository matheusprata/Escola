package com.matheusprata.escola.aluno.application.repository;

import com.matheusprata.escola.aluno.domain.Aluno;
import java.util.List;

public interface AlunoRepository {
    Aluno saveAluno(Aluno aluno);
    List<Aluno> getAllAlunos();
}