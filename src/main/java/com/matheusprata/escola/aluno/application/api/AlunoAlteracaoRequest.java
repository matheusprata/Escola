package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Sexo;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;

@Value
public class AlunoAlteracaoRequest {
    @Email
    @Column(unique = true)
    @NotNull(message = "Campo email Obrigatório!")
    String email;
    @NotNull(message = "Campo celular Obrigatório!")
    String celular;
    Sexo sexo;
    @NotNull(message = "Campo data Nascimento Obrigatório!")
    LocalDate dataNascimento;
}