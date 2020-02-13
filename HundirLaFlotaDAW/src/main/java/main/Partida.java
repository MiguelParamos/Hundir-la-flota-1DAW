/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author nrcif
 */
public class Partida {
 
    // Declaración de atributos
    private byte turno;       // El turno del jugador
    private Jugador jugador1; // Persona 1 del juego
    private Jugador jugador2; // Persona 2 del juego
    
    // Constructor
    public Partida(){
   
    }
    
    // Getters 
   public Jugador getJugador1(){
        return this.jugador1;
    
    }
    public Jugador getJugador2(){
        return this.jugador2;
    } 
   
    public byte getTurno() {
        return turno;
    }

    // Setters 
     public void setJugador1(Jugador jugador){
        this.jugador1 = jugador;
    }
    public void setJugador2(Jugador jugador){
        this.jugador2 = jugador;
    }

    public void setTurno(byte turno) {
        this.turno = turno;
    }

    
//  Métodos de clase    
    public boolean partidaHaTerminado(){
        return true;
    }
    
}
