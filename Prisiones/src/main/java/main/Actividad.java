/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalTime;

/**
 * clase actividad que alberga todo lo asociado a las actividades
 * @author Juanlu
 */
public class Actividad extends Timing {
    
    private Guardia[] guardias;//array de los guardias asignados a la actividad
    private Bloque bloqueAsignado;//bloque donde se realiza la actividad
    private HabitacionFuncional habitacion ;//habitacin asignada a la actividad
    
    
    /**
     * Constructor de actividad con todos sus campos
     * @param nombre nombre de la actividad
     * @param guardias guardias asignados a la actividad
     * @param bloqueAsignado bloque donde se realiza la actividad
     * @param habitacion habitacion asignada a la actividad
     * @param horaInicio hora a la que inicia la actividad
     * @param horaFin hora a la que finaliza la actividad
     */
    public Actividad(String nombre, Guardia[] guardias, Bloque bloqueAsignado, HabitacionFuncional habitacion, LocalTime horaInicio, LocalTime horaFin) {
        super(horaInicio,horaFin);
        this.guardias = guardias;
        this.bloque=bloqueAsignado;
        this.habitacion=habitacion;
    }
    
    /**
     * getter de los guardias de la actividad
     * @return 
     */
    public Guardia[] getGuardia() {
        return guardias;
    }
    /**
     * setter de los guardias de la ctividad
     * @param Guardia 
     */
    public void setGuardia(Guardia[] guardias) {
        this.guardias = guardias;
    }
    /**
     * getter de bloque asignado
     * @return 
     */
    public Bloque getBloque() {
        return bloqueAsignado;
    }
    /**
     * setter del bloque asignado
     * @param Bloque 
     */
    public void setBloque( Bloque bloqueAsignado) {
        this.bloqueAsignado = bloqueAsignado;
    }
    /**
     * getter de la habitacion asignada a la actividad
     * @return 
     */
    public HabitacionFuncional getHabitacionFuncional() {
        return habitacion;
    }
    /**
     * setter de la habitacion asignada a la actividad
     * @param HabitacionFuncional 
     */
    public void setHabitacionFuncional(HabitacionFuncional habitacion ) {
        this.habitacion = habitacion;
    }
    
}
