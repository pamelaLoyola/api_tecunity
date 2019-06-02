package org.tecsup.api_tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.api_tecunity.service.ICarreraService;
import org.tecsup.api_tecunity.model.Carrera;
import org.tecsup.api_tecunity.repository.CarreraRepository;

@Service(value = "carreraService")
public class CarreraService implements ICarreraService{

		@Autowired
	    @Qualifier(value = "carreraRepository")
	    private CarreraRepository carreraRepository;

	    @Transactional(readOnly = true)
	    @Override
	    public List<Carrera> findAll() {
	        return this.carreraRepository.findAll();
	    }

	    @Transactional(readOnly = true)
	    @Override
	    public Carrera findById(Integer id) {
	        return this.carreraRepository.findById(id).orElse(null);
	    }

	    @Transactional
	    @Override
	    public void save(Carrera carrera) {
	        this.carreraRepository.save(carrera);
	    }

	    @Transactional
	    @Override
	    public void delete(Carrera carrera) {
	        this.carreraRepository.delete(carrera);
	    }
}
