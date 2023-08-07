package com.matheusprata.escola.turma.domain;

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
    private String ano;
}
