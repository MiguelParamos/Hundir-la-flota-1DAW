/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 * clase del vehiculo de combate avion 
 * 
 * @author Juanlu
 */
public class Avion extends VehiculoDeCombate {
    private boolean direccionMovimiento;//variable de la direccion del movimiento del avion
    
    /**
     * 
     * @param m mapa sobre el que se juega
     */
    public void movimientoAvion(Mapa m){
        
    }
    /**
     * constructor de avion con todos los campos
     * @param posiciones posicion del avion
     * @param nombre nombre de avion
     * @param simbolo simbolo del avion
     * @param estado estado del avion
     * @param mov movimiento del avion
     */
    public Avion(CasillaBarco[] posiciones, String nombre,boolean mov){
        super(posiciones,nombre,'A');
        setDireccionMovimiento(mov);
    }
    /**
     * setter de la direccion del movimiento
     * @return la direccion del movimiento
     */
    public boolean isDireccionMovimiento() {
        return direccionMovimiento;
    }
    /**
     * setter del movimiento del avion a partir de la direccion del movimiento
     * @param direccionMovimiento direccion del movimiento del avion
     */
    public final void setDireccionMovimiento(boolean direccionMovimiento) {
        this.direccionMovimiento = direccionMovimiento;
    }
    
    
    
}