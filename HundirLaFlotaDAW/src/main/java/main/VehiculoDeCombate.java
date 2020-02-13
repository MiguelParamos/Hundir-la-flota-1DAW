/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase que representa un vehiculo de combate que puede ser avion o barco
 * @author Jose Martín
 */
public class VehiculoDeCombate extends ElementoConNombre {
    //VehiculoDe combate se estiende a ElementoConNombre
    private CasillaBarco[] posiciones;
    private char estado;
    private char simbolo;
    /**
     * Constructor de VehiculosDeCombate con todos 
     * los datos 
     * @param n nombre  de ElementoConNombre
     */

    public VehiculoDeCombate(CasillaBarco[] p, String n, char s,char e) {
        super(n);
        setPosiciones(p);
        setSimbolo(s);
        setEstado(e);
    }
    /**
     * Método que no devuelve nada y lleva void
     * @param posición x
     * @param posición y 
     */
    public void recibirDisparos(int x, int y) {

    }
    
    //Getter de Estado
    public char getEstado() {
        return this.estado;
    }
    //Getter de Simbolo
    public char getSimbolo() {
        return this.simbolo;
    }
    //Getter de Posiciones
    public CasillaBarco[] getPosiciones() {
        return this.posiciones;
    }
    
    public final void setEstado(char e){
        estado=e;
    }
    
    public final void setSimbolo(char s){
        this.simbolo=s;
    }

    public final void setPosiciones(CasillaBarco[] cb){
        this.posiciones=cb;
    }
}
