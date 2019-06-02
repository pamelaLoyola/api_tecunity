package org.tecsup.api_tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.api_tecunity.model.Participante;

@Repository(value = "participanteRepository")
public interface ParticipanteRepository extends JpaRepository<Participante, Integer> {

}
