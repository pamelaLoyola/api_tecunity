package org.tecsup.api_tecunity.service;

import java.util.List;

import org.tecsup.api_tecunity.model.Carrera;

public interface ICarreraService {

	List<Carrera> findAll();

    Carrera findById(Integer id);

    void save(Carrera carrera);

    void delete(Carrera carrera);
}
