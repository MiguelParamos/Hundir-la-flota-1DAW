/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalTime;

/**
 * Descripción de clase Timing: Clase que define la hora inicio y la hora final
 * de los trabajos/actividades.
 *
 * @author Daniel Pérez García 17/02/2020
 */
public class Timing {

    private LocalTime horaInicio; //hora inicio
    private LocalTime horaFin; //hora final

    /**
     *
     * @param cosaConNombre
     * @param horaInicio
     * @param horaFin
     * @param Trabajo
     * @param Actividad
     */
    public Timing(LocalTime horaInicio, LocalTime horaFin) {

        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public LocalTime getHoraInicio() {

        return this.horaInicio;

    }

    public void setHoraInicio(LocalTime lt) {
        this.horaInicio = lt;
    }
    
    
    public LocalTime getHoraFin() {

        return this.horaFin;

    }

    public void setHoraFin(LocalTime lt) {
        this.horaFin = lt;
    }
}
