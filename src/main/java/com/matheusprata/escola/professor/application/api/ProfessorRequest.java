package com.matheusprata.escola.professor.application.api;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
@Value
public class ProfessorRequest {
    @Column(name = "cpf", unique = true, updatable = false)
    String cpf;
    @NotNull(message = "Campo Nome Obrigatório!")
    String nomeCompleto;
    @NotNull(message = "turma Obrigatório")
    String turma;
    @Email
    @Column(unique = true)
    String email;
    String celular;
    String formacao;
}
