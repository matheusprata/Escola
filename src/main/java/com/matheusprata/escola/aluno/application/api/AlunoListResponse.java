package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.aluno.domain.Sexo;
import lombok.Value;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class AlunoListResponse {
    UUID idAluno;
    String cpf;
    String nomeCompleto;
    String email;
    String celular;
    Sexo sexo;
    LocalDate dataNascimento;
    LocalDate dataMatricula;

    public static List<AlunoListResponse> converte(List<Aluno> alunos){
        return alunos.stream()
                .map(AlunoListResponse::new)
                .collect(Collectors.toList());
    }

    public AlunoListResponse(Aluno aluno) {
        this.idAluno = aluno.getIdAluno();
        this.cpf = aluno.getCpf();
        this.nomeCompleto = aluno.getNomeCompleto();
        this.email = aluno.getEmail();
        this.celular = aluno.getCelular();
        this.sexo = aluno.getSexo();
        this.dataNascimento = aluno.getDataNascimento();
        this.dataMatricula = aluno.getDataMatricula();
    }
}