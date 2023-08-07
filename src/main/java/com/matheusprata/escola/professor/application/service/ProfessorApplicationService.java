package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.professor.application.api.*;
import com.matheusprata.escola.professor.application.repository.ProfessorRepository;
import com.matheusprata.escola.professor.domain.Professor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProfessorApplicationService implements ProfessorService{
    private final ProfessorRepository professorRepository;

    @Override
    public ProfessorIdResponse saveProfessor(ProfessorRequest professorRequest) {
        log.info("[inicia] ProfessorApplicationService - saveProfessor");
        Professor professor = professorRepository.saveProfessor(new Professor(professorRequest));
        log.info("[finaliza] ProfessorApplicationService - saveProfessor");
        return ProfessorIdResponse.builder().idProfessor(professor.getIdProfessor()).build();
    }

    @Override
    public List<ProfessorListResponse> getAllProfessores() {
        log.info("[inicia] ProfessorApplicationService - getAllProfessores");
        List<Professor> professores = professorRepository.getAllProfessores();
        log.info("[finaliza] ProfessorApplicationService - getAllProfessores");
        return ProfessorListResponse.converte(professores);
    }

    @Override
    public ProfessorDetalhadoResponse getOneProfessor(UUID idProfessor) {
        log.info("[inicia] ProfessorApplicationService - getOneProfessor");
        Professor professor = professorRepository.getOneProfessor(idProfessor);
        log.info("[finaliza] ProfessorApplicationService - getOneProfessor");
        return new ProfessorDetalhadoResponse(professor);
    }

    @Override
    public void updateProfessor(UUID idProfessor, ProfessorAlteracaoRequest professorAlteracaoRequest) {
        log.info("[inicia] ProfessorApplicationService - updateProfessor");
        Professor professor = professorRepository.getOneProfessor(idProfessor);
        professor.update(professorAlteracaoRequest);
        professorRepository.saveProfessor(professor);
        log.info("[finaliza] ProfessorApplicationService - updateProfessor");
    }
}