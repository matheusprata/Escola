package com.matheusprata.escola.professor.application.repository;

import com.matheusprata.escola.professor.domain.Professor;

public interface ProfessorRepository {
    Professor saveProfessor(Professor professor);
}