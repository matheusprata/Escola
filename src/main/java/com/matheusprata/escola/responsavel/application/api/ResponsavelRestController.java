package com.matheusprata.escola.responsavel.application.api;

import com.matheusprata.escola.responsavel.application.service.ResponsavelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
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
}