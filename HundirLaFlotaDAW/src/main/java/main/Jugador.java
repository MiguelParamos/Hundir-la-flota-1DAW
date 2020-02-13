/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Objeto Jugador, encangado de realizar funciones del juego
 *
 * @author 2DAW
 */
public class Jugador {

    private byte puntuacion;// puntos obtenidos por el jugador
    private mapa Mapa;// localización de las piezas (barco/avión) del jugador

    public Jugador(byte puntuacion, mapa Mapa) {
        this.setPuntuacion(puntuacion);
        this.setMapa(mapa);
    }

    /**
     * getter de Puntuación
     * @return puntuación del jugador
     */
    public byte getPuntuacion() {
        return this.puntuacion;
    }

    /**
     * getter de Mapa
     * @return localización de barcos/aviones del jugador
     */
    public byte getMapa() {
        return this.mapa;
    }

    public void setPuntuacion(byte puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setMapa(mapa Mapa) {
        this.Mapa = Mapa;
    }
    
   
/**
 * Función disparar al rival contrario
 * @param posX posición de disparo barco/avión en el eje X del mapa del rival
 * @param posY posición de disparo a barco/avión en el eje X del mapa del rival
 * @param mapaRival indicará si le ha dado al barco/avión o al agua
 * @return 
 */
    public String disparar(byte posX, byte posY, Mapa mapaRival) {
        return "dado";
    }
/**
 * Función que devulve el turno del jugador
 * @param turno, momento de la partida
 * @return turno
 */
    public String jugarTurno(int turno) {
        return turno + "";
    }
/**
 * Función que devuelve el nombre del Jugador
 * @param nombre nombre dle jugador
 * @return nombre
 */
    public String jugador(String nombre) {
        return nombre;
    }
    /**
     * Función que devuelve si el jugador ha perdido o ganado
     * true= ha perdido l partida
     * @return  false, ha ganado la partida
     */
    public boolean hasPerdido() {

        boolean hasPerdido = true;

        if (hasPerdido == true) {
            System.out.println("Has perdido");
        }
        return false;
    }
}
