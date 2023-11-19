package com.matheusprata.escola.turma.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.professor.domain.Professor;
import com.matheusprata.escola.turma.application.api.TurmaAlteracaoRequest;
import com.matheusprata.escola.turma.application.api.TurmaRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @ManyToMany
    @JoinTable(
            name = "professor_turma",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    @JsonIgnore
    private List<Professor> professores;

    @NotNull(message = "Campo turma Obrigatório!")
    private String turma;
    @NotNull(message = "Campo sala Obrigatório!")
    private String sala;
    @NotNull(message = "Campo turno Obrigatório!")
    @Enumerated(EnumType.STRING)
    private Turno turno;
    @NotNull(message = "Campo ano Obrigatório!")
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

    public Turma(Professor professor, TurmaRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
        this.professores = getProfessores();
    }

    public void update(TurmaAlteracaoRequest turmaRequest) {
        this.turma = turmaRequest.getTurma();
        this.sala = turmaRequest.getSala();
        this.turno = turmaRequest.getTurno();
        this.ano = turmaRequest.getAno();
    }
}