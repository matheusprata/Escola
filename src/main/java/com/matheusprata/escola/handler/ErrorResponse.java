package com.matheusprata.escola.handler;

import lombok.Value;

@Value
public class ErrorResponse {
    int codigo;
    String mensagem;
}
