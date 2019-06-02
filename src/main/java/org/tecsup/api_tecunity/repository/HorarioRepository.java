package org.tecsup.api_tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.api_tecunity.model.Horario;

@Repository(value = "horarioRepository")
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

}
