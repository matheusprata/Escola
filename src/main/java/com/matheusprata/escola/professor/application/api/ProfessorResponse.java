package com.matheusprata.escola.professor.application.api;

import com.matheusprata.escola.professor.domain.Professor;
import lombok.Value;

import java.util.UUID;
@Value
public class ProfessorResponse {
    UUID idProfessor;
    String cpf;
    String nomeCompleto;
    String email;
    String celular;
    String formacao;

    public ProfessorResponse(Professor professor){
        this.idProfessor = professor.getIdProfessor();
        this.cpf = professor.getCpf();
        this.nomeCompleto = professor.getNomeCompleto();
        this.email = professor.getEmail();
        this.celular = professor.getCelular();
        this.formacao = professor.getFormacao();
    }
}