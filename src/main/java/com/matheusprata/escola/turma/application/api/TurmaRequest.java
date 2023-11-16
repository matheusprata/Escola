package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

@Value
public class TurmaRequest {
    String turma;
    String sala;
    Turno turno;
    Integer ano;
}
