package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ProfessorService {
    ProfessorResponse saveProfessor(Long idTurma, ProfessorRequest professorRequest);
    List<ProfessorListResponse> getAllProfessores();
    ProfessorResponse getOneProfessor(UUID idProfessor);
    void updateProfessor(UUID idProfessor, ProfessorAlteracaoRequest professorAlteracaoRequest);
}
