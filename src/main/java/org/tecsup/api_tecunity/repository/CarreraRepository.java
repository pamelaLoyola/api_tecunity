package org.tecsup.api_tecunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tecsup.api_tecunity.model.Carrera;

@Repository(value = "carreraRepository")
public interface CarreraRepository extends JpaRepository<Carrera, Integer>{

}
