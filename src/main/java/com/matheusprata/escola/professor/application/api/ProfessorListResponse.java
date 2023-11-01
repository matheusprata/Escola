package com.matheusprata.escola.professor.application.api;

import com.matheusprata.escola.professor.domain.Professor;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ProfessorListResponse {
    UUID idProfessor;
    String nomeCompleto;

    public ProfessorListResponse (Professor professor){
        this.idProfessor = professor.getIdProfessor();
        this.nomeCompleto = professor.getNomeCompleto();
    }
    public static List<ProfessorListResponse> converte(List<Professor>professores){
        return professores.stream()
                .map(ProfessorListResponse::new)
                .collect(Collectors.toList());
    }
}