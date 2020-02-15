/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Clase barco donde alojaremos todo lo relacionado con el
 * @author nico
 */
public class Barco extends VehiculoDeCombate{
/**
 * Funcion para meter barco en una casilla
 * @param posiciones
 * @param n
 * @param s simbolo del barco
 * @param e estado del barco
 */
    public Barco(CasillaBarco []posiciones, String n,char s,char e){
        super(posiciones,n,s,e);
        
    } 
    
}
