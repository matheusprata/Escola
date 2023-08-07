package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.ProfessorDetalhadoResponse;
import com.matheusprata.escola.professor.application.api.ProfessorIdResponse;
import com.matheusprata.escola.professor.application.api.ProfessorListResponse;
import com.matheusprata.escola.professor.application.api.ProfessorRequest;

import java.util.List;
import java.util.UUID;

public interface ProfessorService {
    ProfessorIdResponse saveProfessor(ProfessorRequest professorRequest);
    List<ProfessorListResponse> getAllProfessores();
    ProfessorDetalhadoResponse getOneProfessor(UUID idProfessor);
}
