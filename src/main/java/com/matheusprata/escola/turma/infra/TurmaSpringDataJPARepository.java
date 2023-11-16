package com.matheusprata.escola.turma.infra;

import com.matheusprata.escola.turma.domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TurmaSpringDataJPARepository extends JpaRepository<Turma, Long> {
    List<Turma> findAllByAno(Integer ano);
}
