package com.matheusprata.escola.aluno.application.api;

import lombok.Value;
import java.time.LocalDate;

@Value
public class AlunoAlteracaoRequest {
    String turma;
    String email;
    String celular;
    LocalDate dataNascimento;
}
