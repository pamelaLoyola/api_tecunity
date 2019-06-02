package org.tecsup.api_tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.api_tecunity.model.Asesoria;

@Repository(value = "asesoriaRepository")
public interface AsesoriaRepository extends JpaRepository<Asesoria, Integer> {

}
