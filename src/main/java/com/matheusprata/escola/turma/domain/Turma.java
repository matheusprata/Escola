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
    private List<Aluno> alunos;

    @ManyToMany
    @JoinTable
            (name = "turma_professor", joinColumns = @JoinColumn(name = "idTurma"),
            inverseJoinColumns = @JoinColumn(name = "idProfessor"))
    private List<Professor> professores;

    private String turma;
    private String sala;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    @Enumerated(EnumType.STRING)
    private HorarioAula horario;
    private Integer ano;

    public Turma(TurmaRequest turmaRequest, Aluno alunos, Professor professores) {
        this.alunos = (List<Aluno>) alunos;
        this.professores = (List<Professor>) professores;
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.horario = turmaRequest.getHorario();
        this.ano = turmaRequest.getAno();
    }
}