package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.domain.HorarioAula;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

@Value
public class TurmaRequest {
    String sala;
    Turno turno;
    HorarioAula horario;
    Integer ano;
}
