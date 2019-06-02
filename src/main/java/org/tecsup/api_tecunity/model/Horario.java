package org.tecsup.api_tecunity.model;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "horario")
public class Horario implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_horario")
    private Integer idHorario;

    @Column(name = "hora_inicio")
    private Time horaInicio;

    @Column(name = "hora_fin")
    private Time horaFin;

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "idHorario=" + idHorario +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                '}';
    }

}
