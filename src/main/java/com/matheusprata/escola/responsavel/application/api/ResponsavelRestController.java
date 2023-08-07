package com.matheusprata.escola.responsavel.application.api;

import com.matheusprata.escola.aluno.application.api.AlunoResponsavelResponse;
import com.matheusprata.escola.responsavel.application.service.ResponsavelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ResponsavelRestController implements ResponsavelApi{
    private final ResponsavelService responsavelService;

    @Override
    public ResponsavelResponse saveResponsavel(UUID idAluno, ResponsavelRequest responsavelRequest) {
        log.info("[inicia] ResponsavelRestController - saveResponsavel");
        ResponsavelResponse responsavelCriado = responsavelService.saveResponsavel(idAluno, responsavelRequest);
        log.info("[finaliza] ResponsavelRestController - saveResponsavel");
        return responsavelCriado;
    }

    @Override
    public List<ResponsavelListResponse> getAllResponsaveis() {
        log.info("[inicia] ResponsavelRestController - getAllResponsaveis");
        List<ResponsavelListResponse> responsaveis = responsavelService.getAllResponsaveis();
        log.info("[finaliza] ResponsavelRestController - getAllResponsaveis");
        return responsaveis;
    }

    @Override
    public AlunoResponsavelResponse getAllResponsaveisAlunos(UUID idAluno) {
        log.info("[inicia] ResponsavelRestController - getAllResponsaveisAlunos");
        AlunoResponsavelResponse response = responsavelService.getAllResponsaveisAlunos(idAluno);
        log.info("[finaliza] ResponsavelRestController - getAllResponsaveisAlunos");
        return response;
    }

    @Override
    public void updateResponsavel(UUID idResponsavel, ResponsavelAlteracaoRequest responsavelAlteracaoRequest) {
        log.info("[inicia] ResponsavelRestController - updateResponsavel");
        responsavelService.updateResponsavel(idResponsavel, responsavelAlteracaoRequest);
        log.info("[finaliza] ResponsavelRestController - updateResponsavel");
    }
}