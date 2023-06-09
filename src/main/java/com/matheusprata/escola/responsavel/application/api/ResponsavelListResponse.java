package com.matheusprata.escola.responsavel.application.api;

import com.matheusprata.escola.responsavel.domain.Responsavel;
import lombok.Value;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ResponsavelListResponse {
    UUID idResponsavel;
    String nomeCompleto;
    String email;
    String telefone;
    String cep;
    String endereco;
    String cidade;

    public static List<ResponsavelListResponse> converte(List<Responsavel> responsaveis){
        return responsaveis.stream()
                .map(ResponsavelListResponse::new)
                .collect(Collectors.toList());
    }

    public ResponsavelListResponse(Responsavel responsavel){
        this.idResponsavel = responsavel.getIdResponsavel();
        this.nomeCompleto = responsavel.getNomeCompleto();
        this.email = responsavel.getEmail();
        this.telefone = responsavel.getTelefone();
        this.cep = responsavel.getCep();
        this.endereco = responsavel.getEndereco();
        this.cidade = responsavel.getCidade();
    }
}