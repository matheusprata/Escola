package com.matheusprata.escola.professor.domain;

import com.matheusprata.escola.professor.application.api.ProfessorAlteracaoRequest;
import com.matheusprata.escola.professor.application.api.ProfessorRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProfessor;

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
    @NotNull(message = "formacao Obrigatório")
    String formacao;

    public Professor(ProfessorRequest professorRequest){
        this.cpf = professorRequest.getCpf();
        this.nomeCompleto = professorRequest.getNomeCompleto();
        this.turma = professorRequest.getTurma();
        this.email = professorRequest.getEmail();
        this.celular = professorRequest.getCelular();
        this.formacao = professorRequest.getFormacao();
    }

    public void update(ProfessorAlteracaoRequest professorAlteracaoRequest) {
        this.nomeCompleto = professorAlteracaoRequest.getNomeCompleto();
        this.turma = professorAlteracaoRequest.getTurma();
        this.email = professorAlteracaoRequest.getEmail();
        this.celular = professorAlteracaoRequest.getCelular();
        this.formacao = professorAlteracaoRequest.getFormacao();
    }
}