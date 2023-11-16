package com.matheusprata.escola.turma.infra;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
@Log4j2
@RequiredArgsConstructor
public class TurmaInfraRepository implements TurmaRepository {
    private final TurmaSpringDataJPARepository turmaSpringDataJPARepository;

    @Override
    public Turma saveTurma(Turma turma) {
        log.info("[inicia] TurmaInfraRepository - saveTurma");
        try{
            turmaSpringDataJPARepository.save(turma);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "Turma já cadastrada", e);
        }
        log.info("[finaliza] TurmaInfraRepository - saveTurma");
        return turma;
    }

    @Override
    public List<Turma> getAllTurmas() {
        log.info("[inicia] TurmaInfraRepository - saveTurma");
        List<Turma> turmas = turmaSpringDataJPARepository.findAll();
        log.info("[finaliza] TurmaInfraRepository - saveTurma");
        return turmas;
    }

    @Override
    public List<Turma> findAllByAno(Integer ano) {
        log.info("[inicia] TurmaInfraRepository - getAno");
        List<Turma> turmas = turmaSpringDataJPARepository.findAllByAno(ano);
        log.info("[finaliza] TurmaInfraRepository - getAno");
        return turmas;
    }

    @Override
    public Optional<Turma> findById(Long idTurma) {
        log.info("[inicia] TurmaInfraRepository - findById");
        Optional<Turma> turmaOptional = turmaSpringDataJPARepository.findById(idTurma);
        log.info("[finaliza] TurmaInfraRepository - findById");
        return turmaOptional;
    }
}
