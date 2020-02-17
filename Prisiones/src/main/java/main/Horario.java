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
    
    private Timing[] actividadesDiarias;//actividades que se realizan en el horario
    
    /**
     * Constructor de Horario
     * @param actividadesDiarias 
     */
    public Horario(Timing[] actividadesDiarias) {
        this.actividadesDiarias=actividadesDiarias ;
    }
    
    
    /**
     * getter de las actividades diarias q se realizan
     * @return 
     */
    public Timing[] getTiming() {
        return  actividadesDiarias;
    }
    /**
     * setter de las actividades diarias que se realizan
     * @param Timing 
     */
    public void setTiming(Timing[] actividadesDiarias) {
        this.actividadesDiarias = actividadesDiarias;
    }
    
    
}
