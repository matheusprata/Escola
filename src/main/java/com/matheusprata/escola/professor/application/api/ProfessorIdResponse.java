package com.matheusprata.escola.professor.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class ProfessorIdResponse {
    UUID idProfessor;
}
