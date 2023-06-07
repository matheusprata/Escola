package com.matheusprata.escola.responsavel.application.api;

import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.responsavel.domain.Responsavel;
import lombok.Value;
import java.util.UUID;

@Value
public class ResponsavelResponse {
    Aluno aluno;
    UUID idResponsavel;
    String nomeCompleto;
    String email;
    String telefone;
    String cep;
    String endereco;
    String cidade;

    public ResponsavelResponse(Responsavel responsavel){
        this.aluno = responsavel.getAluno();
        this.idResponsavel = responsavel.getIdResponsavel();
        this.nomeCompleto = responsavel.getNomeCompleto();
        this.email = responsavel.getEmail();
        this.telefone = responsavel.getTelefone();
        this.cep = responsavel.getCep();
        this.endereco = responsavel.getEndereco();
        this.cidade = responsavel.getCidade();
    }
}