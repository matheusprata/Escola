package com.matheusprata.escola.turma.application.api;

import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.professor.domain.Professor;
import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;
import lombok.Value;

import java.util.List;

@Value
public class TurmaResponse {
    List<Aluno> aluno;
    List<Professor> idProfessor;
    String turma;
    String sala;
    Turno turno;
    Integer ano;

    public TurmaResponse(Turma turma, Aluno aluno, Professor professor){
        this.aluno = turma.getAlunos();
        this.idProfessor = turma.getProfessores();
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
}