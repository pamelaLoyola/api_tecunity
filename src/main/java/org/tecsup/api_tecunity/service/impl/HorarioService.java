package org.tecsup.api_tecunity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tecsup.api_tecunity.service.IHorarioService;
import org.tecsup.api_tecunity.model.Horario;
import org.tecsup.api_tecunity.repository.HorarioRepository;

@Service(value = "horarioService")
public class HorarioService implements IHorarioService {

	@Autowired
    @Qualifier(value = "horarioRepository")
    private HorarioRepository horarioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Horario> findAll() {
        return this.horarioRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Horario findById(Integer id) {
        return this.horarioRepository.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void save(Horario horario) {
        this.horarioRepository.save(horario);
    }

    @Transactional
    @Override
    public void delete(Horario horario) {
        this.horarioRepository.delete(horario);
    }
}
