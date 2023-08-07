package com.matheusprata.escola.turma.domain;

import com.matheusprata.escola.turma.application.api.TurmaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    private String sala;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    @Enumerated(EnumType.STRING)
    private HorarioAula horario;
    private Integer ano;

    public Turma(TurmaRequest turmaRequest) {
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.horario = turmaRequest.getHorario();
        this.ano = turmaRequest.getAno();
    }
}
