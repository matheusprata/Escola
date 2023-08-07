package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.ProfessorIdResponse;
import com.matheusprata.escola.professor.application.api.ProfessorListResponse;
import com.matheusprata.escola.professor.application.api.ProfessorRequest;
import com.matheusprata.escola.professor.application.repository.ProfessorRepository;
import com.matheusprata.escola.professor.domain.Professor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
}