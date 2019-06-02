package org.tecsup.api_tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.api_tecunity.model.Asesoria;
import org.tecsup.api_tecunity.service.IAsesoriaService;
import org.tecsup.api_tecunity.repository.AsesoriaRepository;

@Service(value = "asesoriaService")
public class AsesoriaService implements IAsesoriaService {
	
	@Autowired
    @Qualifier(value = "asesoriaRepository")
    private AsesoriaRepository asesoriaRepository;

	@Transactional(readOnly = true)
    @Override
	public List<Asesoria> findAll() {
		return this.asesoriaRepository.findAll();
	}

	 @Transactional(readOnly = true)
	    @Override
	public Asesoria findById(Integer id) {
		 return this.asesoriaRepository.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public void save(Asesoria asesoria) {
		 this.asesoriaRepository.save(asesoria);
		
	}

	@Transactional
	@Override
	public void delete(Asesoria asesoria) {
		this.asesoriaRepository.delete(asesoria);
		
	}

}
