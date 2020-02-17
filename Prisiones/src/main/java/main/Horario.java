/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *  clase Horario que contiene todo lo relacionado con el horario
 * @author Juanlu
 */
public class Horario {
    
    private actividadesDiarias[] Timing;//actividades que se realizan en el horario
    
    /**
     * Constructor de Horario
     * @param actividadesDiarias 
     */
    public Horario(String actividadesDiarias[]) {
        this.Timing =actividadesDiarias ;
    }
    
    
    /**
     * getter de las actividades diarias q se realizan
     * @return 
     */
    public actividadesDiarias[] getTiming() {
        return Timing;
    }
    /**
     * setter de las actividades diarias que se realizan
     * @param Timing 
     */
    public void setTiming(actividadesDiarias[] Timing) {
        this.Timing = Timing;
    }
    
    
}
