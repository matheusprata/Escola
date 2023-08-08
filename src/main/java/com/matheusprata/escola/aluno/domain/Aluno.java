package com.matheusprata.escola.aluno.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.aluno.application.api.AlunoAlteracaoRequest;
import com.matheusprata.escola.aluno.application.api.AlunoRequest;
import com.matheusprata.escola.responsavel.domain.Responsavel;
import com.matheusprata.escola.turma.domain.Turma;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAluno;

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aluno")
    @JsonIgnore
    List<Responsavel> responsavel;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    @JsonIgnore
    private Turma turma;

    @Column(name = "cpf", unique = true, updatable = false)
    private String cpf;
    @NotNull(message = "Campo Nome Obrigatório!")
    private String nomeCompleto;
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
        this.email = alunoRequest.getEmail().toUpperCase();
        this.celular = alunoRequest.getCelular();
        this.sexo = alunoRequest.getSexo();
        this.dataNascimento = alunoRequest.getDataNascimento();
        this.dataMatricula = alunoRequest.getDataMatricula();
    }

    public void update(AlunoAlteracaoRequest alunoAlteracaoRequest) {
        this.email = alunoAlteracaoRequest.getEmail().toUpperCase();
        this.celular = alunoAlteracaoRequest.getCelular();
        this.dataNascimento = alunoAlteracaoRequest.getDataNascimento();
    }
}