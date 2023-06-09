package com.matheusprata.escola.responsavel.infra;

import com.matheusprata.escola.responsavel.domain.Responsavel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ResponsavelSpringDataJPARepository extends JpaRepository<Responsavel, UUID> {
}