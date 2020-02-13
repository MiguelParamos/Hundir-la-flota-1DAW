/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
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
        this.posiciones = p;
        this.simbolo = s;
        this.estado=e;
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
    
    //Setter de Estado
    public void setEstado(char e){
        estado=e;
    }
    //Setter de Simbolo
    public void setSimbolo(char s){
        this.simbolo=s;
    }
    //Setter de Posiciones
    public void setPosiciones(CasillaBarco[] cb){
        this.posiciones=cb;
    }
}
