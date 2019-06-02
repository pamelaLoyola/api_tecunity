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
import org.tecsup.api_tecunity.model.Horario;
import org.tecsup.api_tecunity.service.IHorarioService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class HorarioController {

	 @Autowired
	    @Qualifier(value = "horarioService")
	    private IHorarioService iHorarioService;

	    @GetMapping(value = {"/horarios"})
	    List<Horario> showAll() {
	        return this.iHorarioService.findAll();
	    }

	    @GetMapping(value = {"/horario/{id}"})
	    Horario showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iHorarioService.findById(id);
	    }

	    @PostMapping(value = {"/horario"})
	    @ResponseStatus(HttpStatus.CREATED)
	    Horario create(@RequestBody Horario horario) {
	        this.iHorarioService.save(horario);
	        return horario;
	    }

	    @PutMapping(value = {"/horario/{id}"})
	    Horario update(@RequestBody Horario horario, @PathVariable(value = "id") Integer id) {
	        Horario currentHorario = this.iHorarioService.findById(id);
	        //currentParticipante.setUsuario(participante.getUsuario());
	        //currentParticipante.setCiclo(participante.getCiclo());
	        this.iHorarioService.save(currentHorario);
	        return currentHorario;
	    }

	    @DeleteMapping(value = {"/horario/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
	        Horario horario = this.iHorarioService.findById(id);
	        this.iHorarioService.delete(horario);

	    }

}
