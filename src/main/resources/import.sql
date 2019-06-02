
INSERT INTO `horario` (`id_horario`, `hora_fin`, `hora_inicio`) VALUES (NULL, '08:00:00', '10:00:00');
INSERT INTO `horario` (`id_horario`, `hora_fin`, `hora_inicio`) VALUES (NULL, '09:00:00', '11:00:00');

INSERT INTO curso (curso_id, curso_nombre) VALUES (1, 'Desarrollo de Aplicaciones Empresariales');
INSERT INTO curso (curso_id, curso_nombre) VALUES (2, 'Programación en móviles');

INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (1, 'Administración de redes y comunicaciones');
INSERT INTO carrera (carrera_id, carrera_nombre) VALUES (2, 'Procesos químicos y metalúrgicos');

INSERT INTO participante (par_id, par_nombre, par_apellido, par_usuario, par_email, par_foto, par_celular, par_ciclo, carrera_carrera_id) VALUES (1, 'Sebastián', 'Sánchez', 'Sebas07', 'sebastian.sanchez@tecsup.edu.pe', 'sebas.jpg', '963214785', 'IV', 1);
INSERT INTO participante (par_id, par_nombre, par_apellido, par_usuario, par_email, par_foto, par_celular, par_ciclo, carrera_carrera_id) VALUES (2, 'Adrian', 'Palacios', 'AdrianPM', 'adrian.palacios@tecsup.edu.pe', 'adrian.jpg', '995532983', 'IV', 2);

INSERT INTO asesoria (id_asesoria, ase_titulo, ase_descripcion, ase_etiqueta, ase_estado, ase_tipo, ase_fecha, curso_curso_id, horario_id_horario) VALUES (1, 'Clase de química', 'Clase de nomenclaturas', 'quimica', 'en curso', '1', '2019-06-19', 1, 1);
INSERT INTO asesoria (id_asesoria, ase_titulo, ase_descripcion, ase_etiqueta, ase_estado, ase_tipo, ase_fecha, curso_curso_id, horario_id_horario) VALUES (2, 'Clase de React', 'Consumir un API Rest con React', 'react, javascript, django', 'en curso', '1', '2019-06-19', 2, 2);

--INSERT INTO asesoria_participante(id_asesoria, par_id) VALUES (1,1);
--INSERT INTO asesoria_participante(id_asesoria, par_id) VALUES (1,2);
--INSERT INTO asesoria_participante(id_asesoria, par_id) VALUES (2,1);