package com.matheusprata.escola.professor.application.api;

import com.matheusprata.escola.professor.domain.Professor;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ProfessorListResponse {
    UUID idProfessor;
    String cpf;
    String nomeCompleto;
    String turma;
    String email;
    String celular;

    public ProfessorListResponse (Professor professor){
        this.idProfessor = professor.getIdProfessor();
        this.cpf = professor.getCpf();
        this.nomeCompleto = professor.getNomeCompleto();
        this.turma = professor.getTurma();
        this.email = professor.getEmail();
        this.celular = professor.getCelular();
    }
    public static List<ProfessorListResponse> converte(List<Professor>professores){
        return professores.stream()
                .map(ProfessorListResponse::new)
                .collect(Collectors.toList());
    }
}