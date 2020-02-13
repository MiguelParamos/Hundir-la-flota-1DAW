/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase que modela Partida para mi juego hundir la flota.
 * @author nrcif
 */
public class Partida {
 
    // Declaración de atributos
    private byte turno;       // El turno del jugador
    private Jugador jugador1; // Persona 1 del juego
    private Jugador jugador2; // Persona 2 del juego
    
    // Constructor de Partida que tiene en cuenta los turnos de cada jugador.
    public Partida(){
   
    }
    
    /**
     * Getter del jugador1. 
     * @return devuelve jugador1.
     */
   public Jugador getJugador1(){
        return this.jugador1;
    
    }
   /**
    * Getter del jugador2.
    * @return devuelve jugador2.
    */
    public Jugador getJugador2(){
        return this.jugador2;
    } 
   /**
    * Getter del turno que toca en la partida.
    * @return devuelve el turno de cada jugador.
    */
    public byte getTurno() {
        return turno;
    }

    /**
     * Setter de jugador1.
     * @param jugador el jugador1 de la partida.
     */
     public void setJugador1(Jugador jugador){
        this.jugador1 = jugador;
    }
     /**
      * Setter de jugador2.
      * @param jugador  el jugador2 de la partida.
      */
    public void setJugador2(Jugador jugador){
        this.jugador2 = jugador;
    }
    /**
     * Setter de turno.
     * @param turno el turno del jugador en la partida.
     */

    public void setTurno(byte turno) {
        this.turno = turno;
    }

    
   /**
    * Método de la clase Partida creada para cuando finaliza.
    * @return devuelve true para ----, false para ----.
    */
    public boolean partidaHaTerminado(){
        return true;
    }
    
}
