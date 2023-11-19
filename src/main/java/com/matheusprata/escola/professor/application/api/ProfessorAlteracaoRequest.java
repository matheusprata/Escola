package com.matheusprata.escola.professor.application.api;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProfessorAlteracaoRequest {
    @NotNull(message = "Campo Nome Obrigatório!")
    String nomeCompleto;
    @Email
    @Column(unique = true)
    String email;
    @NotNull(message = "Campo celular Obrigatório!")
    String celular;
    @NotNull(message = "formacao Obrigatório")
    String formacao;
}
