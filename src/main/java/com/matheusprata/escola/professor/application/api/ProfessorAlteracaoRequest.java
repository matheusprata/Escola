package com.matheusprata.escola.professor.application.api;

import lombok.Value;

@Value
public class ProfessorAlteracaoRequest {
    String nomeCompleto;
    String email;
    String celular;
    String formacao;
}
