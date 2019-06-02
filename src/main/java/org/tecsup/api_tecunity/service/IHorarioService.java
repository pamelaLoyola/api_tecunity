package org.tecsup.api_tecunity.service;

import java.util.List;

import org.tecsup.api_tecunity.model.Horario;

public interface IHorarioService {

	 List<Horario> findAll();

	    Horario findById(Integer id);

	    void save(Horario horario);

	    void delete(Horario horario);
}
