package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.aluno.domain.Sexo;
import com.matheusprata.escola.responsavel.application.api.ResponsavelListResponse;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
public class AlunoResponsavelResponse {
    UUID idAluno;
    String cpf;
    String nomeCompleto;
    String turma;
    String email;
    String celular;
    Sexo sexo;
    LocalDate dataNascimento;
    LocalDate dataMatricula;
    List<ResponsavelListResponse> responsaveis;

    public AlunoResponsavelResponse(Aluno aluno) {
        this.idAluno = aluno.getIdAluno();
        this.cpf = aluno.getCpf();
        this.nomeCompleto = aluno.getNomeCompleto();
        this.turma = aluno.getTurma();
        this.email = aluno.getEmail();
        this.celular = aluno.getCelular();
        this.sexo = aluno.getSexo();
        this.dataNascimento = aluno.getDataNascimento();
        this.dataMatricula = aluno.getDataMatricula();
        this.responsaveis = ResponsavelListResponse.converte(aluno.getResponsavel());
    }
}