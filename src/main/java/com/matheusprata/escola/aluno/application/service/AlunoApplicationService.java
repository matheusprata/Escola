package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.*;
import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

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

    @Override
    public List<AlunoListResponse> getAllAlunos() {
        log.info("[inicia] AlunoApplicationService - getAllAlunos");
        List<Aluno> alunos = alunoRepository.getAllAlunos();
        log.info("[finaliza] AlunoApplicationService - getAllAlunos");
        return AlunoListResponse.converte(alunos);
    }

    @Override
    public AlunoResponse getByCpf(String cpf) {
        log.info("[inicia] AlunoApplicationService - getByCpf");
        Aluno aluno = alunoRepository.findByCpf(cpf)
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Cliente não encontrado!"));
        log.info("[finaliza] AlunoApplicationService - getByCpf");
        return new AlunoResponse(aluno);
    }

    @Override
    public void updateAluno(String cpf, AlunoAlteracaoRequest alunoAlteracaoRequest) {
        log.info("[inicia] AlunoApplicationService - updateAluno");
        Aluno aluno = alunoRepository.findByCpf(cpf)
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Cliente não encontrado!"));
        aluno.update(alunoAlteracaoRequest);
        alunoRepository.saveAluno(aluno);
        log.info("[finaliza] AlunoApplicationService - updateAluno");
    }
}