package com.matheusprata.escola.turma.application.repository;

import com.matheusprata.escola.turma.domain.Turma;

import java.util.List;
import java.util.Optional;

public interface TurmaRepository {
    Turma saveTurma(Turma turma);
    List<Turma> getAllTurmas();
    List<Turma> findAllByAno(Integer ano);
    Optional<Turma> findById(Long idTurma);
}
