package com.eliasfs06.tinktime.model;

import com.eliasfs06.tinktime.model.enums.StatusHorario;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class Horario extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime horaInicio;

    private LocalTime horaFim;

    @Enumerated(EnumType.STRING)
    private StatusHorario statusHorario;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public StatusHorario getStatusHorario() {
        return statusHorario;
    }

    public void setStatusHorario(StatusHorario statusHorario) {
        this.statusHorario = statusHorario;
    }
}
