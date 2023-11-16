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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurma;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    @JsonIgnore
    private Aluno aluno;

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

    public void update(TurmaAlteracaoRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
    }
}