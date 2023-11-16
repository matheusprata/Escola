package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.aluno.domain.Sexo;
import com.matheusprata.escola.turma.domain.Turma;
import com.matheusprata.escola.turma.domain.Turno;

import java.time.LocalDate;
import java.util.UUID;

public class AlunoTurmaResponse {
    UUID idAluno;
    String cpf;
    String nomeCompleto;
    String email;
    String celular;
    Sexo sexo;
    LocalDate dataNascimento;
    LocalDate dataMatricula;
    Long idTurma;
    String turma;
    String sala;
    Turno turno;
    Integer ano;

    public AlunoTurmaResponse(Aluno aluno, Turma turma) {
        //dados aluno
        this.idAluno = aluno.getIdAluno();
        this.cpf = aluno.getCpf();
        this.nomeCompleto = aluno.getNomeCompleto();
        this.email = aluno.getEmail();
        this.celular = aluno.getCelular();
        this.sexo = aluno.getSexo();
        this.dataNascimento = aluno.getDataNascimento();
        this.dataMatricula = aluno.getDataMatricula();
        //dados turma
        this.idTurma = turma.getIdTurma();
        this.turma = turma.getTurma();
        this.sala = turma.getSala();
        this.turno = turma.getTurno();
        this.ano = turma.getAno();
    }
}
