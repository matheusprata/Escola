package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

@Value
public class TurmaResponse {
    String turma;
    String sala;
    Turno turno;
    Integer ano;

    public TurmaResponse(Turma turma){
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
}