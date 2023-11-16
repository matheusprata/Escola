package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class TurmaListResponse {
    String turma;
    String sala;
    Turno turno;
    Integer ano;

    public static List<TurmaListResponse> converte(List<Turma> turmas){
        return turmas.stream()
                .map(TurmaListResponse::new)
                .collect(Collectors.toList());
    }

    public TurmaListResponse(Turma turma){
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
}
