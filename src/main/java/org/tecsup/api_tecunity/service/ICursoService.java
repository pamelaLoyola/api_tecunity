package org.tecsup.api_tecunity.service;

import java.util.List;

import org.tecsup.api_tecunity.model.Curso;

public interface ICursoService {

	List<Curso> findAll();

    Curso findById(Integer id);

    void save(Curso curso);

    void delete(Curso curso);
}
