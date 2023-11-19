package com.matheusprata.escola.professor.application.api;

import com.matheusprata.escola.professor.application.service.ProfessorService;
import com.matheusprata.escola.turma.application.api.ProfessorTurmaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProfessorRestController implements ProfessorApi{
    private final ProfessorService professorService;

    @Override
    public ProfessorResponse saveProfessor(Long idTurma, ProfessorRequest professorRequest) {
        log.info("[inicia] ProfessorRestController - saveProfessor");
        ProfessorResponse Response = professorService.saveProfessor(idTurma, professorRequest);
        log.info("[finaliza] ProfessorRestController - saveProfessor");
        return Response;
    }

    @Override
    public List<ProfessorListResponse> getAllProfessores() {
        log.info("[inicia] ProfessorRestController - getAllProfessores");
        List<ProfessorListResponse> professores = professorService.getAllProfessores();
        log.info("[inicia] ProfessorRestController - getAllProfessores");
        return professores;
    }

    @Override
    public ProfessorResponse getOneProfessor(UUID idProfessor) {
        log.info("[inicia] ProfessorRestController - getOneProfessor");
        ProfessorResponse response = professorService.getOneProfessor(idProfessor);
        log.info("[finaliza] ProfessorRestController - getOneProfessor");
        return response;
    }

    @Override
    public ProfessorTurmaResponse getProfessorByTurma(Long idTurma) {
        log.info("[inicia] ProfessorRestController - getAllProfessorByTurma");
        ProfessorTurmaResponse buscaProfessorTurma = professorService.getProfessorByTurma(idTurma);
        log.info("[finaliza] ProfessorRestController - getAllProfessorByTurma");
        return buscaProfessorTurma;
    }

    @Override
    public void updateProfessor(UUID idProfessor, ProfessorAlteracaoRequest professorAlteracaoRequest) {
        log.info("[inicia] ProfessorRestController - updateProfessor");
        professorService.updateProfessor(idProfessor, professorAlteracaoRequest);
        log.info("[finaliza] ProfessorRestController - updateProfessor");
    }
}