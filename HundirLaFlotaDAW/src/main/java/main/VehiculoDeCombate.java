/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jose
 */
public class VehiculoDeCombate extends ElementoConNombre {

    private CasillaBarco[] posiciones;
    private char estado;
    private char simbolo;

    public VehiculoDeCombate(CasillaBarco[] p, String n, char s,char e) {
        super(n);
        setPosiciones(p);
        setSimbolo(s);
        setEstado(e);
    }

    public void recibirDisparos(int x, int y) {

    }

    public char getEstado() {
        return this.estado;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

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
