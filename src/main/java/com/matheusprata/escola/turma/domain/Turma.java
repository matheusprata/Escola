package com.matheusprata.escola.turma.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.professor.domain.Professor;
import com.matheusprata.escola.turma.application.api.TurmaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    @OneToMany
    @JsonIgnore
    List<Aluno> alunos;

    @ManyToMany(mappedBy="turmas" , cascade = CascadeType.ALL)
    @JsonIgnore
    List<Professor> professores;

    private String turma;
    private String sala;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    @Enumerated(EnumType.STRING)
    private HorarioAula horario;
    private Integer ano;

    public Turma(TurmaRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.horario = turmaRequest.getHorario();
        this.ano = turmaRequest.getAno();
    }
}