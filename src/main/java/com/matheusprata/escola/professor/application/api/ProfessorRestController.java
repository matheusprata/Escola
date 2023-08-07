package com.matheusprata.escola.professor.application.api;

import com.matheusprata.escola.professor.application.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProfessorRestController implements ProfessorApi{
    private final ProfessorService professorService;

    @Override
    public ProfessorIdResponse saveProfessor(ProfessorRequest professorRequest) {
        log.info("[inicia] ProfessorRestController - saveProfessor");
        ProfessorIdResponse idResponse = professorService.saveProfessor(professorRequest);
        log.info("[finaliza] ProfessorRestController - saveProfessor");
        return idResponse;
    }

    @Override
    public List<ProfessorListResponse> getAllProfessores() {
        log.info("[inicia] ProfessorRestController - getAllProfessores");
        List<ProfessorListResponse> professores = professorService.getAllProfessores();
        log.info("[inicia] ProfessorRestController - getAllProfessores");
        return professores;
    }
}
