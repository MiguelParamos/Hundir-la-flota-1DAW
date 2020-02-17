/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 * Objeto Jugador, encangado de realizar funciones del juego
 *
 * @author Silvia SB
 */
public class Jugador extends ElementoConNombre{

    private byte puntuacion;// puntos obtenidos por el jugador
    private Mapa mapa;// localización de las piezas (barco/avión) del jugador
/**
 * Constructor de Jugador
 * @param n
 * @param puntuacion
 * @param mapa 
 */
    public Jugador(String n,byte puntuacion, Mapa mapa) {
        super(n);
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
    public Mapa getMapa() {
        return this.mapa;
    }
    
    /**
     * setter de puntuación
     * @param puntuacion 
     */
    public final void setPuntuacion(byte puntuacion) {
        this.puntuacion = puntuacion;
    }
    /**
     * setter de mapa
     * @param mapa 
     */
    public final void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
   
/**
 * Función disparar al rival contrario
 * @param posX posición de disparo barco/avión en el eje X del mapa del rival
 * @param posY posición de disparo a barco/avión en el eje X del mapa del rival
 * @param mapaRival indicará si le ha dado al barco/avión o al agua
 * @return boolean
 */
    public boolean disparar(byte posX, byte posY, Mapa mapaRival) {
        return posX==mapa.getNfilas()&&posY==mapa.getNcolumnas();
    }
/**
 * Función: el jugador toma acción contra otro jugador
 * @param turno
 * @return null 
 */
    public String jugarTurno(int turno) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Turno "+turno);
        mapa.toString();
        mapa.imprimeParaRival();
        byte dfila, dcolumna;
        do {
            System.out.println("Indique la fila que desea disapara");
            dfila=Byte.parseByte(sc.nextLine());
            System.out.println("Indique la columna que desea disapara");
            dcolumna=Byte.parseByte(sc.nextLine());
        } while (dfila>mapa.getNfilas()&&dcolumna>mapa.getNcolumnas());
        
        if (disparar(dfila, dcolumna, this.getMapa())) {
            System.out.println("¡He tocado un vehículo!");
        }else{
            System.out.println("¡Agua!");
        }
        return null;
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

        return false;
    }
}
