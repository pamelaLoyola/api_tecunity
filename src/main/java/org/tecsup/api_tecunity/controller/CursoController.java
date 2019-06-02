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
import org.tecsup.api_tecunity.model.Curso;
import org.tecsup.api_tecunity.service.ICursoService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class CursoController {


    @Autowired
    @Qualifier(value = "cursoService")
    private ICursoService iCursoService;

    @GetMapping(value = {"/cursos"})
    List<Curso> showAll() {
        return this.iCursoService.findAll();
    }

    @GetMapping(value = {"/curso/{id}"})
    Curso showIndividual(@PathVariable(value = "id") Integer id) {
        return this.iCursoService.findById(id);
    }

    @PostMapping(value = {"/curso"})
    @ResponseStatus(HttpStatus.CREATED)
    Curso create(@RequestBody Curso curso) {
        this.iCursoService.save(curso);
        return curso;
    }

    @PutMapping(value = {"/curso/{id}"})
    Curso update(@RequestBody Curso curso, @PathVariable(value = "id") Integer id) {
        Curso currentCurso = this.iCursoService.findById(id);
        //currentParticipante.setUsuario(participante.getUsuario());
        //currentParticipante.setCiclo(participante.getCiclo());
        this.iCursoService.save(currentCurso);
        return currentCurso;
    }

    @DeleteMapping(value = {"/curso/{id}"})
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable(value = "id") Integer id) {
        Curso curso = this.iCursoService.findById(id);
        this.iCursoService.delete(curso);

    }
}
