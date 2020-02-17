/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Clase que ejecuta VehiculoDeCombate que estiende a ElementoConNombre
 * completa a barco y avión.
 * @author Jose Martín
 */
public class VehiculoDeCombate extends ElementoConNombre {
    //VehiculoDe combate se estiende a ElementoConNombre
    private CasillaBarco[] posiciones;//Array que indica en que casilla se encuentra el barco
    private char estado;//Carácter de estado que pueden ser 3 tocado, hundido o agua.
    private char simbolo;//Caracter de simbolo que puede ser barco o avión
    /**
     * Constructor de VehiculosDeCombate con todos 
     * los datos 
     * @param n nombre  de ElementoConNombre
     */

    public VehiculoDeCombate(CasillaBarco[] p, String n, char s,char e) {
        super(n);
        setPosiciones(p);//Posición
        setSimbolo(s);//Simbolo
        setEstado(e);//Estado
    }
    /**
     * Descripción metodo recibirDisparo: Se utiliza para indicar si un barco o un avión le ha disparado a una casilla.
     * @param posición eje x
     * @param posición eje y 
     */
    
     public void rellenarRecibirDisparo(int x, int y){
        
        for (int i = 0; i < posiciones.length; i++) {
            
            posiciones[i].equals(recibirDisparos(x,y));
            
            if(posiciones[i].equals(true)){
                
                if(estado=='n'){
                    
                    estado='t';
                    
                }
                
            }
        }
        
    }
    
    public boolean recibirDisparos(int x, int y) {
        
        for (int i = 0; i < posiciones.length; i++) {
            
            if(posiciones[i].equals(x)){
                
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }
       return false;
    }
    
    /**
     * Getter de estado
     * @return devuelve el estado del barco o del avión
     */
    
    public char getEstado() {
        return this.estado;
    }
    /**
     * Getter de Simbolo
     * @return el simbolo que puede ser un Barco o un Avión
     */
    public char getSimbolo() {
        return this.simbolo;
    }
    /**
     * Getter de Posición
     * @return retorna la posión en la que se encuentra en barco o el avión
     */
    public CasillaBarco[] getPosiciones() {
        return this.posiciones;
    }
    /**
     * Setter de Estado
     * @param e nuevo estado
     */
    public final void setEstado(char e){
        estado=e;
    }
    /**
     * Setter de Simbolo
     * @param s nuevo Simbolo
     */
    public final void setSimbolo(char s){
        this.simbolo=s;
    }
    /**
     * Setter de Posiciones
     * @param cb nueva posición
     */
    public final void setPosiciones(CasillaBarco[] cb){
        this.posiciones=cb;
    }
}
