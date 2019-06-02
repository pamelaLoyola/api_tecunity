package org.tecsup.api_tecunity.service;

import java.util.List;

import org.tecsup.api_tecunity.model.Asesoria;

public interface IAsesoriaService {

	List<Asesoria> findAll();

    Asesoria findById(Integer id);

    void save(Asesoria asesoria);

    void delete(Asesoria asesoria);
}
