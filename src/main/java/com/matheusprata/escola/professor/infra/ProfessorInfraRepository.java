package com.matheusprata.escola.professor.infra;

import com.matheusprata.escola.handler.APIException;
import com.matheusprata.escola.professor.application.repository.ProfessorRepository;
import com.matheusprata.escola.professor.domain.Professor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ProfessorInfraRepository implements ProfessorRepository {
   private final ProfessorSpringDataJPARepository professorSpringDataJPARepository;
    @Override
    public Professor saveProfessor(Professor professor) {
        log.info("[inicia] ProfessorInfraRepository - saveProfessor");
        try{
            professorSpringDataJPARepository.save(professor);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST, "professor já cadastrado", e);
        }
        log.info("[finaliza] ProfessorInfraRepository - saveProfessor");
        return professor;
    }
}
