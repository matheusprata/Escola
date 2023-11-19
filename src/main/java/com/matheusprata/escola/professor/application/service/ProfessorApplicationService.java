package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.*;
import com.matheusprata.escola.professor.application.repository.ProfessorRepository;
import com.matheusprata.escola.professor.domain.Professor;
import com.matheusprata.escola.turma.application.api.response.ProfessorTurmaResponse;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProfessorApplicationService implements ProfessorService{
    private final ProfessorRepository professorRepository;
    private final TurmaRepository turmaRepository;

    @Override
    public ProfessorResponse saveProfessor(Long idTurma, ProfessorRequest professorRequest) {
        log.info("[inicia] ProfessorApplicationService - saveProfessor");
        Turma turma = turmaRepository.findById(idTurma);
        Professor professor = professorRepository.saveProfessor(new Professor(professorRequest, turma));
        log.info("[finaliza] ProfessorApplicationService - saveProfessor");
        return new ProfessorResponse(professor);
    }

    @Override
    public List<ProfessorListResponse> getAllProfessores() {
        log.info("[inicia] ProfessorApplicationService - getAllProfessores");
        List<Professor> professores = professorRepository.getAllProfessores();
        log.info("[finaliza] ProfessorApplicationService - getAllProfessores");
        return ProfessorListResponse.converte(professores);
    }

    @Override
    public ProfessorResponse getOneProfessor(UUID idProfessor) {
        log.info("[inicia] ProfessorApplicationService - getOneProfessor");
        Professor professor = professorRepository.getOneProfessor(idProfessor);
        log.info("[finaliza] ProfessorApplicationService - getOneProfessor");
        return new ProfessorResponse(professor);
    }

    @Override
    public void updateProfessor(UUID idProfessor, ProfessorAlteracaoRequest professorAlteracaoRequest) {
        log.info("[inicia] ProfessorApplicationService - updateProfessor");
        Professor professor = professorRepository.getOneProfessor(idProfessor);
        professor.update(professorAlteracaoRequest);
        professorRepository.saveProfessor(professor);
        log.info("[finaliza] ProfessorApplicationService - updateProfessor");
    }

    @Override
    public ProfessorTurmaResponse getProfessorByTurma(Long idTurma) {
        log.info("[inicia] ProfessorApplicationService - getProfessorByTurma");
        Turma turma = turmaRepository.findById(idTurma);
        log.info("[finaliza] ProfessorApplicationService - getProfessorByTurma");
        return new ProfessorTurmaResponse(turma);
    }
}