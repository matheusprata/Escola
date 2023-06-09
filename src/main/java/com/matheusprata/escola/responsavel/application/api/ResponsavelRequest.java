package com.matheusprata.escola.responsavel.application.api;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Value;

@Value
public class ResponsavelRequest {
    @NotNull(message = "Campo Nome Obrigatório!")
    String nomeCompleto;
    @Email
    @Column(unique = true)
    String email;
    String telefone;
    @Pattern(regexp = "^[0-9]{5}-[0-9]{3}$", message = "CEP inválido")
    String cep;
    String endereco;
    String cidade;
}