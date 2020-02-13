/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Descripción Clase CasillaBarco: Clase que describe las casillas del tablero.
 * 
 */
public class CasillaBarco {
    
  private byte posX;//Posición X del tablero.
  private byte posY;//Posición Y del tablero.
  private boolean tocado;//Indica si un barco o un avión le ha disparado a una casilla.
    
    /**
     * Descripción constructor CasillaBarco: Se utiliza para crear y definir las casillas del tablero.
     * @param x Posición X del tablero.
     * @param y Posición Y del tablero.
     * @param t Indicador de casillas.
     */
    public CasillaBarco(byte x,byte y,boolean t){
        
        this.setSituacion(x, y);
        this.tocado=t;
        
    }
    /**
     * Descripción getter getSituacion: Sirve para acceder a las posiciones X e Y.
     * @return retorna los valores que tienen las posiciones X e Y.
     */
    public byte[] getSituacion(){
        
        byte[] posiciones=new byte[2];
        posiciones[0]=this.posX;
        posiciones[1]=this.posY;
        
          return posiciones;
        }
    /**
     * Descripción setter setSituación: Sirve para comprobar y modificar las posiciones de los vehiculos(barcos y aviones).
     * @param x Posición X del tablero.
     * @param y Posición Y del tablero.
     */    
    public void setSituacion(byte x,byte y){
        
        this.posX=x;
        this.posY=y;
        
    }
    /**
     * Descripción metodo recibirDisparo: Se utiliza para indicar si un barco o un avión le ha disparado a una casilla.
     */
    public void recibirDisparo(){
        
        if(this.tocado==true){
            
            System.out.println("Esta casilla esta tocada");
            
        }
        
    }
    
    
    
}

