package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Sexo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;

@Value
public class AlunoRequest {
    @NotNull(message = "Campo Nome Obrigatório!")
    private String nomeCompleto;
    @NotNull(message = "turma Obrigatório")
    private String turma;
    @Email
    @Column(unique = true)
    private String email;
    private String celular;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private LocalDate dataNascimento;
    @Column(name = "cpf", unique = true, updatable = false)
    private String cpf;
    @NotNull(message = "data matricula é obrigatória")
    private LocalDate dataMatricula;
}
