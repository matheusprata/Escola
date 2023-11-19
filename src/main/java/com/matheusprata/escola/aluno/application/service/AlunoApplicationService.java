package com.matheusprata.escola.aluno.application.service;

import com.matheusprata.escola.aluno.application.api.*;
import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.turma.application.api.response.AlunoTurmaResponse;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class AlunoApplicationService implements AlunoService{
    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    @Override
    public AlunoResponse saveAluno(Long idTurma, AlunoRequest alunoRequest) {
        log.info("[inicia] AlunoApplicationService - saveAluno");
        Turma turma = turmaRepository.findById(idTurma);
        Aluno aluno = alunoRepository.saveAluno(new Aluno(alunoRequest, turma));
        log.info("[finaliza] AlunoApplicationService - saveAluno");
        return new AlunoResponse(aluno);
    }

    @Override
    public AlunoTurmaResponse getAlunoByTurma(Long idTurma) {
        log.info("[inicia] TurmaApplicationService - getAlunoByTurma");
        Turma turma = turmaRepository.findById(idTurma);
        log.info("[finaliza] TurmaApplicationService - getAlunoByTurma");
        return new AlunoTurmaResponse(turma);
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
        Aluno aluno = alunoRepository.findByCpf(cpf);
        log.info("[finaliza] AlunoApplicationService - getByCpf");
        return new AlunoResponse(aluno);
    }

    @Override
    public void updateAluno(String cpf, AlunoAlteracaoRequest alunoAlteracaoRequest) {
        log.info("[inicia] AlunoApplicationService - updateAluno");
        Aluno aluno = alunoRepository.findByCpf(cpf);
        aluno.update(alunoAlteracaoRequest);
        alunoRepository.saveAluno(aluno);
        log.info("[finaliza] AlunoApplicationService - updateAluno");
    }
}