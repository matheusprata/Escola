package com.matheusprata.escola.responsavel.infra;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.responsavel.application.repository.ResponsavelRepository;
import com.matheusprata.escola.responsavel.domain.Responsavel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ResponsavelInfraRepository implements ResponsavelRepository {
    private final ResponsavelSpringDataJPARepository responsavelSpringDataJPARepository;

    @Override
    public Responsavel saveResponsavel(Responsavel responsavel) {
        log.info("[inicia] ResponsavelInfraRepository - saveResponsavel");
        try{
            responsavelSpringDataJPARepository.save(responsavel);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Responsavel já cadastrado", e);
        }
        log.info("[finaliza] ResponsavelInfraRepository - saveResponsavel");
        return responsavel;
    }

    @Override
    public List<Responsavel> getAllResponsaveis() {
        log.info("[inicia] ResponsavelInfraRepository - getAllResponsavel");
        List<Responsavel> responsaveis = responsavelSpringDataJPARepository.findAll();
        log.info("[finaliza] ResponsavelInfraRepository - getAllResponsavel");
        return responsaveis;
    }

    @Override
    public Responsavel getOneResponsavel(UUID idResponsavel) {
        Optional<Responsavel> optionalResponsavel = responsavelSpringDataJPARepository.findById(idResponsavel);
        Responsavel responsavel = optionalResponsavel
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,
                        "Contato do responsavel pelo aluno não encontrado!"));
        return responsavel;
    }
}