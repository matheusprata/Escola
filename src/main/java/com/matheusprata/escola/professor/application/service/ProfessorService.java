package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ProfessorService {
    ProfessorIdResponse saveProfessor(ProfessorRequest professorRequest);
    List<ProfessorListResponse> getAllProfessores();
    ProfessorDetalhadoResponse getOneProfessor(UUID idProfessor);
    void updateProfessor(UUID idProfessor, ProfessorAlteracaoRequest professorAlteracaoRequest);
}
