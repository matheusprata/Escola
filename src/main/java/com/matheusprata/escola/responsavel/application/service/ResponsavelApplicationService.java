package com.matheusprata.escola.responsavel.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoResponsavelResponse;
import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.responsavel.application.api.*;
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

    @Override
    public void updateResponsavel(UUID idResponsavel, ResponsavelAlteracaoRequest responsavelAlteracaoRequest) {
        log.info("[inicia] ResponsavelApplicationService - updateResponsavel");
        Responsavel responsavel = responsavelRepository.getOneResponsavel(idResponsavel);
        responsavel.update(responsavelAlteracaoRequest);
        responsavelRepository.saveResponsavel(responsavel);
        log.info("[finaliza] ResponsavelApplicationService - updateResponsavel");
    }

    @Override
    public AlunoResponsavelResponse getAllResponsaveisAlunos(UUID idAluno) {
        log.info("[inicia] ResponsavelApplicationService - getAllResponsaveisAlunos");
        Aluno aluno = alunoRepository.getOneAluno(idAluno);
        log.info("[finaliza] ResponsavelApplicationService - getAllResponsaveisAlunos");
        return new AlunoResponsavelResponse(aluno);
    }
}