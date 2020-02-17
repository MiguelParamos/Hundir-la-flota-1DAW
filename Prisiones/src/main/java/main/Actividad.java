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
    
    private guardias[] Guardia;//array de los guardias asignados a la actividad
    private bloqueAsignado Bloque;//bloque donde se realiza la actividad
    private habitacion HabitacionFuncional;//habitacin asignada a la actividad
    
    
    /**
     * Constructor de actividad con todos sus campos
     * @param nombre nombre de la actividad
     * @param guardias guardias asignados a la actividad
     * @param bloqueAsignado bloque donde se realiza la actividad
     * @param habitacion habitacion asignada a la actividad
     * @param horaInicio hora a la que inicia la actividad
     * @param horaFin hora a la que finaliza la actividad
     */
    public Actividad(String nombre, String guardias[], byte bloqueAsignado, String habitacion, LocalTime horaInicio, LocalTime horaFin) {
        super(nombre,horaInicio,horaFin);
        this.Guardia = guardias;
        this.Bloque=bloqueAsignado;
        this.HabitacionFuncional=habitacion;
        
    }
    
    /**
     * getter de los guardias de la actividad
     * @return 
     */
    public guardias[] getGuardia() {
        return Guardia;
    }
    /**
     * setter de los guardias de la ctividad
     * @param Guardia 
     */
    public void setGuardia(guardias[] Guardia) {
        this.Guardia = Guardia;
    }
    /**
     * getter de bloque asignado
     * @return 
     */
    public bloqueAsignado getBloque() {
        return Bloque;
    }
    /**
     * setter del bloque asignado
     * @param Bloque 
     */
    public void setBloque(bloqueAsignado Bloque) {
        this.Bloque = Bloque;
    }
    /**
     * getter de la habitacion asignada a la actividad
     * @return 
     */
    public habitacion getHabitacionFuncional() {
        return HabitacionFuncional;
    }
    /**
     * setter de la habitacion asignada a la actividad
     * @param HabitacionFuncional 
     */
    public void setHabitacionFuncional(habitacion HabitacionFuncional) {
        this.HabitacionFuncional = HabitacionFuncional;
    }
    
}
