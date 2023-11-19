package com.matheusprata.escola.turma.application.api.request;

import com.matheusprata.escola.turma.domain.Turno;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class TurmaRequest {
    @NotNull(message = "Campo turma Obrigatório!")
    String turma;
    @NotNull(message = "Campo sala Obrigatório!")
    String sala;
    @NotNull(message = "Campo turno Obrigatório!")
    Turno turno;
    @NotNull(message = "Campo ano Obrigatório!")
    Integer ano;
}