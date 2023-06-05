package com.matheusprata.escola.aluno.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class AlunoIdResponse {
    UUID idAluno;
}
