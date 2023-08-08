package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.domain.HorarioAula;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

import java.util.UUID;

@Value
public class TurmaRequest {
    UUID idProfessor;
    UUID idAluno;
    String turma;
    String sala;
    Turno turno;
    HorarioAula horario;
    Integer ano;
}
