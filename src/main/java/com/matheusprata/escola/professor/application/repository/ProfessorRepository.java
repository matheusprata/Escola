package com.matheusprata.escola.professor.application.repository;

import com.matheusprata.escola.professor.domain.Professor;

import java.util.List;
import java.util.UUID;

public interface ProfessorRepository {
    Professor saveProfessor(Professor professor);
    List<Professor> getAllProfessores();
    Professor getOneProfessor(UUID idProfessor);
}