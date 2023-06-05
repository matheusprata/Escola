package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.AlunoIdResponse;
import com.matheusprata.escola.aluno.application.api.AlunoRequest;
import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class AlunoApplicationService implements AlunoService{
    private final AlunoRepository alunoRepository;

    @Override
    public AlunoIdResponse saveAluno(AlunoRequest alunoRequest) {
        log.info("[inicia] AlunoApplicationService - saveAluno");
        Aluno aluno = alunoRepository.saveAluno(new Aluno(alunoRequest));
        log.info("[finaliza] AlunoApplicationService - saveAluno");
        return AlunoIdResponse.builder().idAluno(aluno.getIdAluno()).build();
    }
}