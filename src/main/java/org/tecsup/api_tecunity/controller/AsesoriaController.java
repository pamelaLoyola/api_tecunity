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
import org.tecsup.api_tecunity.model.Asesoria;
import org.tecsup.api_tecunity.service.IAsesoriaService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class AsesoriaController {
	
	@Autowired
    @Qualifier(value = "asesoriaService")
    private IAsesoriaService iAsesoriaService;

    @GetMapping(value = {"/asesorias"})
    List<Asesoria> showAll() {
        return this.iAsesoriaService.findAll();
    }

    @GetMapping(value = {"/asesoria/{id}"})
    Asesoria showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iAsesoriaService.findById(id);
    }

    @PostMapping(value = {"/asesoria"})
    @ResponseStatus(HttpStatus.CREATED)
    Asesoria create(@RequestBody Asesoria asesoria) {
        this.iAsesoriaService.save(asesoria);
        return asesoria;
    }

    @PutMapping(value = {"/asesoria/{id}"})
    Asesoria update(@RequestBody Asesoria asesoria, @PathVariable(value = "id") Integer id) {
        Asesoria currentAsesoria = this.iAsesoriaService.findById(id);
        //currentAsesoria.setUsuario(participante.getUsuario());
        //currentAsesoria.setCiclo(participante.getCiclo());
        this.iAsesoriaService.save(currentAsesoria);
        return currentAsesoria;
    }

    @DeleteMapping(value = {"/asesoria/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Asesoria asesoria = this.iAsesoriaService.findById(id);
        this.iAsesoriaService.delete(asesoria);

    }

}
