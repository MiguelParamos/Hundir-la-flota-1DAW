/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Juanlu
 */
public class Avion extends VehiculoDeCombate {
    private boolean direccionMovimiento;
    
    
    public static void movimientoAvion(Mapa m){
        
    }
    
    public Avion(CasillaBarco[] posiciones, String nombre,char simbolo,char estado,boolean mov){
        super(posiciones,nombre,simbolo,estado);
    }
    
    
}