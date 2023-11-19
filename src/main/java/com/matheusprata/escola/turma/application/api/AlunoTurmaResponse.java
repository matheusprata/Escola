package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.aluno.application.api.AlunoListResponse;
import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;
import java.util.List;

@Value
public class AlunoTurmaResponse {
    Long idTurma;
    String turma;
    String sala;
    Turno turno;
    Integer ano;
    List<AlunoListResponse> alunos;

    public AlunoTurmaResponse(Turma turma) {
        this.idTurma = turma.getIdTurma();
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
        this.alunos = AlunoListResponse.converte(turma.getAlunos());
    }
}