/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 * 
 * @author Javier Alcalde
 * @author Daniel Pérez
 * Descripción clase Mapa: Clase que contiene los elementos 
 * de las otras clases y dónde interactúan.
 */
public class Mapa {
    
    private VehiculoDeCombate[] elementos;//vehículo de combate
    private byte nfilas; //número de filas
    private byte ncolumnas; // número de columnas
    private PosicionMapa[] disparosRecibidos;// disparos recibidos en las posiciones del mapa

    /**
     * Descripción constructor Mapa: Se le da el valor a las variables 
     * internas de los setters.
     */
    public Mapa(VehiculoDeCombate[] elementos, byte nfilas, byte ncolumnas, PosicionMapa[] disparosRecibidos) {
        this.setElementos(elementos);
        this.setNfilas(nfilas);
        this.setNcolumnas(ncolumnas);
        this.setdisparosRecibidos(disparosRecibidos);
 
    }
    
    /**
     * getter de disparosRecibidos
     * @return 
     */
    public PosicionMapa[] getDisparosRecibidos() {
        return disparosRecibidos;
    }
    
    /**
     * setter de disparosRecibidos
     * @param disparosRecibidos 
     */
    public void setDisparosRecibidos(PosicionMapa[] disparosRecibidos) {
        this.disparosRecibidos = disparosRecibidos;
    }
      
    //funcion toString
    public String toString() {
        
        return null;
    }
    
    public String imprimeParaRival(){
        
        return null;
    }

     //funcion colocarBarcosyAviones   
    public void colocarBarcosyAviones(){
        
    }
    //funcion recibirDisparo
    public boolean recibirDisparo(int posX, int posY){
       int[][] posicion = new int [posX][posY];
   
        for (int i = 0; i < posicion.length; i++) {
            for (int j = 0; j < posicion[i].length; j++) {
                if (this.recibirDisparo(posX, posY) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    
    //
    /**
     * Getter getElementos
     * @return elementos.
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
