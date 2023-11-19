package com.matheusprata.escola.turma.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.professor.domain.Professor;
import com.matheusprata.escola.turma.application.api.TurmaAlteracaoRequest;
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

    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "turma")
    @JsonIgnore
    List<Aluno> alunos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "professor_id")
    @JsonIgnore
    private Professor professor;

    private String turma;
    private String sala;
    @Enumerated(EnumType.STRING)
    private Turno turno;
    private Integer ano;

    public Turma(TurmaRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
    }

    public Turma(Aluno aluno, TurmaRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
        this.alunos = (List<Aluno>) aluno;
    }

    public void update(TurmaAlteracaoRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
    }
}