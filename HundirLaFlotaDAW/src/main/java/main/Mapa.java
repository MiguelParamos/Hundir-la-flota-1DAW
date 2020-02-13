/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Javier Alcalde
 * @author Daniel Pérez
 */
public class Mapa {
    
    private VehiculoDeCombate[] elementos;//vehículo de combate
    private byte nfilas; //número de filas
    private byte ncolumnas; // número de columnas

    //constructor
    public Mapa(VehiculoDeCombate[] elementos, byte nfilas, byte ncolumnas) {
        this.setElementos(elementos);
        this.setNfilas(nfilas);
        this.setNcolumnas(ncolumnas);
 
    }
      
    //funcion toString
    public String toString() {
        
        return null;
    }

     //funcion colocarBarcosyAviones   
    public void colocarBarcosyAviones(){
        
    }
    //funcion recibirDisparo
    public boolean recibirDisparo(int posX, int posY){
 
        return true;
    }
    
    //
    /**
     * Getter getElementos
     * @return elementos-
     */
    public VehiculoDeCombate[] getElementos() {
        return elementos;
    }
    /**
     * setter setElementos
     * @param elementos 
     */
    public void setElementos(VehiculoDeCombate[] elementos) {
        this.elementos = elementos;
    }
    /**
     * getter getNfilas
     * @return nfilas (byte).
     */
    public byte getNfilas() {
        return nfilas;
    }
    
    /**
     * setter setNfilas
     * @param nfilas 
     */
    public void setNfilas(byte nfilas) {
        this.nfilas = nfilas;
    }
    /**
     * getter getNcolumnas
     * @return ncolumnas (byte).
     */
    public byte getNcolumnas() {
        return ncolumnas;
    }
    
    /**
     * setter setNcolumnas
     * @param ncolumnas 
     */
    public void setNcolumnas(byte ncolumnas) {
        this.ncolumnas = ncolumnas;
    }
    
}
