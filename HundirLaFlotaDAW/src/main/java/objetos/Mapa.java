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
        this.setDisparosRecibidos(disparosRecibidos);
 
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
      
    /**
     * Función toString(): genera el mapa del jugador
     * @return el mapa del mismo jugador
     */
    public String toString() {
        String res="";
        boolean noes=true;
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                for (int k = 0; k < elementos.length; k++) {
                    for (int l = 0; l < elementos[k].getPosiciones().length; l++) {
                        if(elementos[k].getPosiciones()[l].getPosX()==i&&elementos[k].getPosiciones()[l].getPosY()==j){ //A hay un vehículo dado con anterioridad
                            res+=elementos[k].getSimbolo()+"\t";
                            noes=false;
                        }
                    } 
                }
                if(noes){
                    res+="~\t";
                }
            }
            res+="\n";
        }
        return res;
    }
    
    /**
     * Imprime el mapa como debería verlo el rival
     * @return String con el mapa concatenado
     */
    public String imprimeParaRival(){
        String res="";
        boolean vehiculo=false;
        boolean noes=true;
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                for (int k = 0; k < elementos.length; k++) {
                    for (int l = 0; l < elementos[k].getPosiciones().length; l++) {
                        if(elementos[k].getPosiciones()[l].getPosX()==i&&elementos[k].getPosiciones()[l].getPosY()==j){ //A hay un vehículo dado con anterioridad
                            for (int m = 0; m < disparosRecibidos.length; m++) {
                                if(elementos[k].getPosiciones()[l].getPosX()==disparosRecibidos[m].getPosX()
                                        &&elementos[k].getPosiciones()[l].getPosY()==disparosRecibidos[m].getPosY()
                                        ){//Compruebo si realmente hay un vahículo 
                                    res+=elementos[k].getSimbolo()+"\t";
                                    noes=false;
                                    vehiculo=true;
                                }else if(i==disparosRecibidos[m].getPosX()&&j==disparosRecibidos[m].getPosY()&&!vehiculo){
                                    res+="~\t";
                                    noes=false;
                                }
                            }
                        }
                    } 
                }
                if(noes){
                    res+="?\t";
                }              
            }
            res+="\n";
        }
        return res;
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
