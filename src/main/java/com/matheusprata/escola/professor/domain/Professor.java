package com.matheusprata.escola.professor.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.professor.application.api.ProfessorAlteracaoRequest;
import com.matheusprata.escola.professor.application.api.ProfessorRequest;
import com.matheusprata.escola.turma.domain.Turma;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProfessor;

    @ManyToMany(mappedBy = "professores")
    @JsonIgnore
    private List<Turma> turmas;

    @Column(name = "cpf", unique = true, updatable = false)
    private String cpf;
    @NotNull(message = "Campo Nome Obrigatório!")
    private String nomeCompleto;
    @Email
    @Column(unique = true)
    private String email;
    private String celular;
    @NotNull(message = "formacao Obrigatório")
    private String formacao;

    public Professor(ProfessorRequest professorRequest){
        this.cpf = professorRequest.getCpf();
        this.nomeCompleto = professorRequest.getNomeCompleto();
        this.email = professorRequest.getEmail();
        this.celular = professorRequest.getCelular();
        this.formacao = professorRequest.getFormacao();
    }

    public void update(ProfessorAlteracaoRequest professorAlteracaoRequest) {
        this.nomeCompleto = professorAlteracaoRequest.getNomeCompleto();
        this.email = professorAlteracaoRequest.getEmail();
        this.celular = professorAlteracaoRequest.getCelular();
        this.formacao = professorAlteracaoRequest.getFormacao();
    }
}