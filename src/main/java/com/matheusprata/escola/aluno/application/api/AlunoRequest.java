package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;

@Value
public class AlunoRequest {
    @NotNull(message = "Campo Nome Obrigatório!")
    String nomeCompleto;
    @Email
    @Column(unique = true)
    @NotNull(message = "Campo email Obrigatório!")
    String email;
    @NotBlank(message = "Campo celular Obrigatório!")
    String celular;
    @Enumerated(EnumType.STRING)
    Sexo sexo;
    @NotNull(message = "Campo dataNascimento Obrigatório!")
    LocalDate dataNascimento;
    @NotNull(message = "Campo cpf Obrigatório!")
    @Column(name = "cpf", unique = true, updatable = false)
    String cpf;
    @NotNull(message = "data matricula é obrigatória")
    LocalDate dataMatricula;
}