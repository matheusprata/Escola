package com.matheusprata.escola.aluno.infra;

import com.matheusprata.escola.aluno.application.api.AlunoTurmaResponse;
import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import com.matheusprata.escola.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AlunoInfraRepository implements AlunoRepository {
    private final AlunoSpringDataJPARepository alunoSpringDataJPARepository;

    @Override
    public Aluno saveAluno(Aluno aluno) {
        log.info("[inicia] AlunoInfraRepository - saveAluno");
        try{
            alunoSpringDataJPARepository.save(aluno);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Aluno já cadastrado", e);
        }
        log.info("[inicia] AlunoInfraRepository - saveAluno");
        return aluno;
    }

    @Override
    public List<Aluno> getAllAlunos() {
        log.info("[inicia] AlunoInfraRepository - getAllAlunos");
        List<Aluno> alunos = alunoSpringDataJPARepository.findAll();
        log.info("[finaliza] AlunoInfraRepository - getAllAlunos");
        return alunos;
    }

    public Aluno getOneAluno(UUID idAluno) {
        log.info("[inicia] AlunoInfraRepository - getOneAluno");
        Optional<Aluno> optionalAluno = alunoSpringDataJPARepository.findById(idAluno);
        Aluno aluno = optionalAluno
                .orElseThrow(() -> APIException.build(HttpStatus.BAD_REQUEST,"Responsavel do aluno não encontrado!"));
        log.info("[finaliza] AlunoInfraRepository - getOneAluno");
        return aluno;
    }

    @Override
    public Optional<Aluno> findByCpf(String cpf) {
        log.info("[inicia] AlunoInfraRepository - findByCpf");
        Optional<Aluno> alunoOptional = alunoSpringDataJPARepository.findByCpf(cpf);
        log.info("[finaliza] AlunoInfraRepository - findByCpf");
        return alunoOptional;
    }
}