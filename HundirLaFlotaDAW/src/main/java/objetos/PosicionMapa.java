/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *Clase Posicion Mapa describe las posiciones
 * @author nicoc
 */
public class PosicionMapa {
  private byte posX;//Posición X del tablero.
  private byte posY;//Posición Y del tablero.
    
    /**
     * Descripción constructor CasillaBarco: Se utiliza para crear y definir las casillas del tablero.
     * @param x Posición X del tablero.
     * @param y Posición Y del tablero.
     * @param t Indicador de casillas.
     */
     public PosicionMapa(byte x,byte y){
        
        this.getPosX();
        
        
    }
/**
 * Getter de PosX
 * @return nos devuelve la posicion X
 */
    public byte getPosX() {
        return posX;
    }
/**
 * Getter de PosY
 * @return  Nos devuelve la posicion Y
 */
    public byte getPosY() {
        return posY;
    }
/**
 * Setter de poxX
 * @param posX cambiamos la posicion x
 */
    public void setPosX(byte posX) {
        this.posX = posX;
    }
/**
 * Setter de PosY
 * @param posY  Cambiamos la posicion Y
 */
    public void setPosY(byte posY) {
        this.posY = posY;
    }
                
   
   

   
   
   
    
    
    
    
    

  
}
