package com.matheusprata.escola.aluno.application.api;

import com.matheusprata.escola.aluno.application.service.AlunoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AlunoRestController implements AlunoApi{
    private final AlunoService alunoService;

    @Override
    public AlunoIdResponse saveAluno(AlunoRequest alunoRequest) {
        log.info("[inicia] AlunoRestController - saveAluno");
        AlunoIdResponse alunoCadastrado = alunoService.saveAluno(alunoRequest);
        log.info("[finaliza] AlunoRestController - saveAluno");
        return alunoCadastrado;
    }

    @Override
    public List<AlunoListResponse> getAllAlunos() {
        log.info("[inicia] AlunoRestController - getAllAlunos");
        List<AlunoListResponse> alunos = alunoService.getAllAlunos();
        log.info("[finaliza] AlunoRestController - getAllAlunos");
        return alunos;
    }

    @Override
    public AlunoResponse getByCpf(String cpf) {
        log.info("[inicia] AlunoRestController - getByCpf");
        AlunoResponse getCpf = alunoService.getByCpf(cpf);
        log.info("[finaliza] AlunoRestController - getByCpf");
        return getCpf;
    }

    @Override
    public void updateAluno(String cpf, AlunoAlteracaoRequest alunoAlteracaoRequest) {
        log.info("[inicia] AlunoRestController - updateAluno");
        alunoService.updateAluno(cpf, alunoAlteracaoRequest);
        log.info("[finaliza] AlunoRestController - updateAluno");
    }
}