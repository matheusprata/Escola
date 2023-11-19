package com.matheusprata.escola.turma.application.api.response;

import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

@Value
public class TurmaResponse {
    Long idTurma;
    String turma;
    String sala;
    Turno turno;
    Integer ano;

    public TurmaResponse(Turma turma){
        this.idTurma = turma.getIdTurma();
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
}