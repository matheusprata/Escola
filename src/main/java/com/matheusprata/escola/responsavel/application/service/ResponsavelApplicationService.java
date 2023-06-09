package com.matheusprata.escola.responsavel.application.service;

import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.responsavel.application.api.ResponsavelListResponse;
import com.matheusprata.escola.responsavel.application.api.ResponsavelRequest;
import com.matheusprata.escola.responsavel.application.api.ResponsavelResponse;
import com.matheusprata.escola.responsavel.application.repository.ResponsavelRepository;
import com.matheusprata.escola.responsavel.domain.Responsavel;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ResponsavelApplicationService implements ResponsavelService{
    private final AlunoRepository alunoRepository;
    private final ResponsavelRepository responsavelRepository;

    @Override
    public ResponsavelResponse saveResponsavel(UUID idAluno, ResponsavelRequest responsavelRequest) {
        log.info("[inicia] ResponsavelApplicationService - saveResponsavel");
        Aluno aluno = alunoRepository.getOneAluno(idAluno);
        Responsavel responsavel = responsavelRepository.saveResponsavel(new Responsavel(aluno, responsavelRequest));
        log.info("[finaliza] ResponsavelApplicationService - saveResponsavel");
        return new ResponsavelResponse(responsavel);
    }

    @Override
    public List<ResponsavelListResponse> getAllResponsaveis() {
        log.info("[inicia] ResponsavelApplicationService - getAllResponsaveis");
        List<Responsavel> responsaveis = responsavelRepository.getAllResponsaveis();
        log.info("[finaliza] ResponsavelApplicationService - getAllResponsaveis");
        return ResponsavelListResponse.converte(responsaveis);
    }
}