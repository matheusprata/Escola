package com.matheusprata.escola.responsavel.application.repository;

import com.matheusprata.escola.responsavel.domain.Responsavel;

import java.util.List;

public interface ResponsavelRepository {
    Responsavel saveResponsavel(Responsavel responsavel);
    List<Responsavel> getAllResponsaveis();
}