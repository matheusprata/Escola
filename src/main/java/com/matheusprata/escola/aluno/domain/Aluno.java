package com.matheusprata.escola.aluno.domain;

import com.matheusprata.escola.aluno.application.api.AlunoAlteracaoRequest;
import com.matheusprata.escola.aluno.application.api.AlunoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAluno;

    @Column(name = "cpf", unique = true, updatable = false)
    private String cpf;
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
    @NotNull(message = "data matricula é obrigatória")
    private LocalDate dataMatricula;

    public Aluno(AlunoRequest alunoRequest) {
        this.cpf = alunoRequest.getCpf();
        this.nomeCompleto = alunoRequest.getNomeCompleto().toUpperCase();
        this.turma = alunoRequest.getTurma().toUpperCase();
        this.email = alunoRequest.getEmail().toUpperCase();
        this.celular = alunoRequest.getCelular();
        this.sexo = alunoRequest.getSexo();
        this.dataNascimento = alunoRequest.getDataNascimento();
        this.dataMatricula = alunoRequest.getDataMatricula();
    }

    public void update(AlunoAlteracaoRequest alunoAlteracaoRequest) {
        this.turma = alunoAlteracaoRequest.getTurma().toUpperCase();
        this.email = alunoAlteracaoRequest.getEmail().toUpperCase();
        this.celular = alunoAlteracaoRequest.getCelular();
        this.dataNascimento = alunoAlteracaoRequest.getDataNascimento();
    }
}