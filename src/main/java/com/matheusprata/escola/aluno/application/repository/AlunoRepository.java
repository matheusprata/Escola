package com.matheusprata.escola.aluno.application.repository;

import com.matheusprata.escola.aluno.domain.Aluno;

public interface AlunoRepository {
    Aluno saveAluno(Aluno aluno);
}