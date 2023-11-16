package com.matheusprata.escola.turma.infra;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.turma.application.repository.TurmaRepository;
import com.matheusprata.escola.turma.domain.Turma;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

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
        log.info("[inicia] TurmaInfraRepository - saveTurma");
        return turma;
    }
}
