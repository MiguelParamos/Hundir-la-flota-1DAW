/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 * Descripción Clase CasillaBarco: Clase que describe las casillas del tablero.
 * @author Raúl González Parra
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
    * @param x coordenada x donde se recibe disparo
    * @param y coordenada y donde se recibe disparo
    * @return true->si el disparo ha sido en mi misma posición , false-> en caso contrario
    */
    public boolean recibirDisparo(byte x,byte y){
        
        return false;
    }
    /**
     * Descripción getter isTocado: Se utiliza para acceder al valor de la variable tocado.
     * @return Retorna verdadero o falso, si las casillas han sido tocadas o no. 
     */
    public boolean isTocado() {
        return tocado;
    }
    /**
     * Descripción setter setTocado: Comprueba si las casillas han sido tocadas o no.
     * @param tocado Parámetro que indica el estado de la casilla.  
     */
    public void setTocado(boolean tocado) {
        this.tocado = tocado;
    }
    
    
    
    
    
}

