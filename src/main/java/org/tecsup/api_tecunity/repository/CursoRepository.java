package org.tecsup.api_tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.api_tecunity.model.Curso;

@Repository(value = "cursoRepository")
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
