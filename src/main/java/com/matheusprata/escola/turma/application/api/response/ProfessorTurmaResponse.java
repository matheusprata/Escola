package com.matheusprata.escola.turma.application.api.response;

import com.matheusprata.escola.professor.application.api.ProfessorListResponse;
import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;
import java.util.List;

@Value
public class ProfessorTurmaResponse {
    Long idTurma;
    String turma;
    String sala;
    Turno turno;
    Integer ano;
    List<ProfessorListResponse> professores;

    public ProfessorTurmaResponse(Turma turma) {
        this.idTurma = turma.getIdTurma();
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
        this.professores = ProfessorListResponse.converte(turma.getProfessores());
    }
}
