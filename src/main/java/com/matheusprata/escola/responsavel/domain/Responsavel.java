package com.matheusprata.escola.responsavel.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.responsavel.application.api.ResponsavelAlteracaoRequest;
import com.matheusprata.escola.responsavel.application.api.ResponsavelRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idResponsavel;

    @NotNull(message = "Campo Nome Obrigatório!")
    private String nomeCompleto;
    @Email
    @Column(unique = true)
    private String email;
    private String telefone;
    private String cep;
    private String endereco;
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    @JsonIgnore
    private Aluno aluno;

    public Responsavel(Aluno aluno, ResponsavelRequest responsavelRequest){
        this.nomeCompleto = responsavelRequest.getNomeCompleto().toUpperCase();
        this.email = responsavelRequest.getEmail().toUpperCase();
        this.telefone = responsavelRequest.getTelefone();
        this.cep = responsavelRequest.getCep();
        this.endereco = responsavelRequest.getEndereco().toUpperCase();
        this.cidade = responsavelRequest.getCidade().toUpperCase();
        this.aluno = aluno;
    }

    public void update(ResponsavelAlteracaoRequest responsavelAlteracaoRequest) {
        this.email = responsavelAlteracaoRequest.getEmail().toUpperCase();
        this.telefone = responsavelAlteracaoRequest.getTelefone();
        this.cep = responsavelAlteracaoRequest.getCep();
        this.endereco = responsavelAlteracaoRequest.getEndereco().toUpperCase();
        this.cidade = responsavelAlteracaoRequest.getCidade().toUpperCase();
    }
}