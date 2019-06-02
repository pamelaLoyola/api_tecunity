package org.tecsup.api_tecunity.service;

import java.util.List;

import org.tecsup.api_tecunity.model.Participante;

public interface IParticipanteService {

	 List<Participante> findAll();

	    Participante findById(Integer id);

	    void save(Participante participante);

	    void delete(Participante participante);
}
