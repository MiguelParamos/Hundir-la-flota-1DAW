/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.time.LocalTime;

/**
 *Descripción de clase Timing: Clase que define la hora inicio y la hora final
 * de los trabajos/actividades.
 * @author Daniel Pérez García
 * 17/02/2020
 */
public class Timing {
      
    
LocalTime horaInicio = LocalTime.now(); //hora inicio
LocalTime horaFin = LocalTime.now(); //hora final


/**
 * 
 * @param cosaConNombre
 * @param horaInicio
 * @param horaFin
 * @param Trabajo
 * @param Actividad 
 */
public Timing(String cosaConNombre, LocalTime horaInicio, LocalTime horaFin, String Trabajo, String Actividad) {
 
    this.horaInicio=horaInicio;
    this.horaFin=horaFin;
        
    /**
     * Funcion de Timing.
     */
    }


/*public String getHora(){
        
        return this.horaInicio+this.horaFin;
              
    }

public String setHora(){
        
        return this.horaInicio+this.horaFin;
              
    }*/
}
