package com.matheusprata.escola.aluno.infra;

import com.matheusprata.escola.aluno.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AlunoSpringDataJPARepository extends JpaRepository<Aluno, UUID> {
    Optional<Aluno> findByCpf(String cpf);
}