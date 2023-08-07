package com.matheusprata.escola.professor.application.service;

import com.matheusprata.escola.professor.application.api.ProfessorIdResponse;
import com.matheusprata.escola.professor.application.api.ProfessorRequest;

public interface ProfessorService {
    ProfessorIdResponse saveProfessor(ProfessorRequest professorRequest);
}
