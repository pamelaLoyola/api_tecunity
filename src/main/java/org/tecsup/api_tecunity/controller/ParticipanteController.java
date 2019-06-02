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
import org.tecsup.api_tecunity.model.Participante;
import org.tecsup.api_tecunity.service.IParticipanteService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class ParticipanteController {

	@Autowired
    @Qualifier(value = "participanteService")
    private IParticipanteService iParticipanteService;

    @GetMapping(value = {"/participantes"})
    List<Participante> showAll() {
        return this.iParticipanteService.findAll();
    }

    @GetMapping(value = {"/participante/{id}"})
    Participante showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iParticipanteService.findById(id);
    }

    @PostMapping(value = {"/participante"})
    @ResponseStatus(HttpStatus.CREATED)
    Participante create(@RequestBody Participante participante) {
        this.iParticipanteService.save(participante);
        return participante;
    }

    @PutMapping(value = {"/participante/{id}"})
    Participante update(@RequestBody Participante participante, @PathVariable(value = "id") Integer id) {
        Participante currentParticipante = this.iParticipanteService.findById(id);
        currentParticipante.setUsuario(participante.getUsuario());
        currentParticipante.setCiclo(participante.getCiclo());
        this.iParticipanteService.save(currentParticipante);
        return currentParticipante;
    }

    @DeleteMapping(value = {"/participante/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Participante participante = this.iParticipanteService.findById(id);
        this.iParticipanteService.delete(participante);

    }
}
