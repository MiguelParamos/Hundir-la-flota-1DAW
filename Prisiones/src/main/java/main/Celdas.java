/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Celdas de la Prisión
 * @author Silvia SB
 */
public class Celdas {
    private short numeroCelda;//numero asignado a cada celda
    private byte capacidad; // numero de presos en cada celda
    private Preso [] presos; // array de presos asignados en la celda
    private Bloque bloque; // asígnar el bloque de la celda
    
   /**
    * cosntructor de Celda, vienen por parámetros las variables necesarias
    * @param numeroCelda  número idenditificativo de la celda
    * @param capacidad número de presos en cada celda
    */
    public Celdas (short numeroCelda, byte capacidad){
        this.setNumeroCelda(numeroCelda);
        this.setCapacidad(capacidad);

    }
/**
 * getter de NumeroCelda
 * @return numeroCelda
 */
    public short getNumeroCelda() {
        return numeroCelda;
    }
/**
 * getter de Capacidad
 * @return capacidad
 */
    public byte getCapacidad() {
        return capacidad;
    }
/**
 * getter de Prso
 * @return presos
 */
    public Preso[] getPresos() {
        return presos;
    }
/**
 * Setter de Capacidad
 * @param capacidad 
 */
    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }
 /**
  * Función para añadir preso a la celda
  * @param preso 
  */   
    public void añadirPreso(Preso preso) {
 /**
  * Función para quitar preso a la celda
  * @param preso
  */   
    }
     public void quitarPreso(Preso preso) {
    
    }
/** 
 * Función para devoler el string de la clase Preso
 * @return  numero, capacidad y preso en un String
 */
    @Override
    public String toString() {
        return "Celdas{" + "numeroCelda=" + numeroCelda + ", capacidad=" + capacidad + ", presos=" + presos + '}';
    }
     
     
}
