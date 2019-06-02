package org.tecsup.api_tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.api_tecunity.service.IParticipanteService;
import org.tecsup.api_tecunity.model.Participante;
import org.tecsup.api_tecunity.repository.ParticipanteRepository;

@Service(value = "participanteService")
public class ParticipanteService implements IParticipanteService {

	 @Autowired
	    @Qualifier(value = "participanteRepository")
	    private ParticipanteRepository participanteRepository;

	    @Override
	    @Transactional(readOnly = true)
	    public List<Participante> findAll() {
	        return this.participanteRepository.findAll();
	    }

	    @Override
	    @Transactional(readOnly = true)
	    public Participante findById(Integer id) {
	        return this.participanteRepository.findById(id).orElse(null);
	    }

	    @Override
	    @Transactional
	    public void save(Participante participante) {
	        this.participanteRepository.save(participante);
	    }

	    @Override
	    @Transactional
	    public void delete(Participante participante) {
	        this.participanteRepository.delete(participante);
	    }
}
