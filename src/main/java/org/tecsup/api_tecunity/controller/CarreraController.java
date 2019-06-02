package org.tecsup.api_tecunity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tecsup.api_tecunity.model.Carrera;
import org.tecsup.api_tecunity.service.ICarreraService;
@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class CarreraController {

	 @Autowired
	    @Qualifier(value = "carreraService")
	    private ICarreraService iCarreraService;

	    @GetMapping(value = {"/carreras"})
	    List<Carrera> showAll() {
	        return this.iCarreraService.findAll();
	    }

	    @GetMapping(value = {"/carrera/{id}"})
	    Carrera showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iCarreraService.findById(id);
	    }

	    @PostMapping(value = {"/carrera"})
	    @ResponseStatus(HttpStatus.CREATED)
	    Carrera create(@RequestBody Carrera carrera) {
	        this.iCarreraService.save(carrera);
	        return carrera;
	    }

	    @PutMapping(value = {"/carrera/{id}"})
	    Carrera update(@RequestBody Carrera carrera, @PathVariable(value = "id") Integer id) {
	        Carrera currentCarrera = this.iCarreraService.findById(id);
	        //currentParticipante.setUsuario(participante.getUsuario());
	        //currentParticipante.setCiclo(participante.getCiclo());
	        this.iCarreraService.save(currentCarrera);
	        return currentCarrera;
	    }

	    @DeleteMapping(value = {"/carrera/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
	        Carrera carrera = this.iCarreraService.findById(id);
	        this.iCarreraService.delete(carrera);

	    }
}
