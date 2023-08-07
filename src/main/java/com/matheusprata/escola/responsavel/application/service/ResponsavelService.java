package com.matheusprata.escola.responsavel.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoResponsavelResponse;
import com.matheusprata.escola.responsavel.application.api.*;
import java.util.List;
import java.util.UUID;

public interface ResponsavelService {
    ResponsavelResponse saveResponsavel(UUID idAluno, ResponsavelRequest responsavelRequest);
    List<ResponsavelListResponse> getAllResponsaveis();
    void updateResponsavel(UUID idResponsavel, ResponsavelAlteracaoRequest responsavelAlteracaoRequest);
    AlunoResponsavelResponse getAllResponsaveisAlunos(UUID idAluno);
}