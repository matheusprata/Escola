package com.matheusprata.escola.responsavel.infra;

import com.matheusprata.escola.responsavel.application.repository.ResponsavelRepository;
import com.matheusprata.escola.responsavel.domain.Responsavel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ResponsavelInfraRepository implements ResponsavelRepository {
    private final ResponsavelSpringDataJPARepository responsavelSpringDataJPARepository;

    @Override
    public Responsavel saveResponsavel(Responsavel responsavel) {
        log.info("[inicia] ResponsavelInfraRepository - saveResponsavel");
        Responsavel responsavelCriado = responsavelSpringDataJPARepository.save(responsavel);
        log.info("[finaliza] ResponsavelInfraRepository - saveResponsavel");
        return responsavelCriado;
    }

    @Override
    public List<Responsavel> getAllResponsaveis() {
        log.info("[inicia] ResponsavelInfraRepository - getAllResponsavel");
        List<Responsavel> responsaveis = responsavelSpringDataJPARepository.findAll();
        log.info("[finaliza] ResponsavelInfraRepository - getAllResponsavel");
        return responsaveis;
    }
}