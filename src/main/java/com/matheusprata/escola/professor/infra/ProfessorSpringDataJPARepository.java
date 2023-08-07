package com.matheusprata.escola.professor.infra;

import com.matheusprata.escola.professor.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorSpringDataJPARepository extends JpaRepository<Professor, UUID> {
}
