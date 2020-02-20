/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Descripción de clase trabajo: Clase que define qué trabajo realiza cada preso,
 *su remuneración, el bloque asignado y los vigilantes asignados a este.
 * @author Daniel Perez Garcia
 * 
 * 
 */
public class Trabajo {
    
    private Preso preso;
    private short remuneracion;
    private byte bloque;
    private vigilante guardia;
    
    /**
     * 
     * @return 
     */
    
    public short remunerar (){

        return remuneracion;
}
    
    /**
     * 
     * @return 
     * Getter de preso.
     */
   public Preso getPreso() {
      return preso;
   }
   
   /**
    * 
    * @param pre 
    * Setter de preso.
    */
   public void setPreso( Preso pre) {
      this.preso = pre;

    }  
   
   /**
    * 
    * @return 
    * Getter de remuneracion.
    */
    
    public  short getRemuneracion() {
      return remuneracion;
   }
    
    /**
     * 
     * @param rem 
     * Setter de remuneracion.
     */
   public void setRemuneracion( short rem) {
      this.remuneracion = rem;

    }
   
   /**
    * 
    * @return 
    * Getter de bloque.
    */
   
   public  byte getBloque() {
      return bloque;
   }
   
   /**
    * 
    * @param bloque 
    * Setter de bloque.
    */
   
   public void setBloque( byte bloque) {
      this.bloque = bloque;

    } 
   
   /**
    * 
    * @return 
    * Getter de guardia.
    */
   
    public vigilante getGuardia() {
      return guardia;
   }
    
    /**
     * 
     * @param guar 
     * Setter de guardia.
     */
    
   public void setGuardia( vigilante guar) {
      this.guardia = guar;

    } 
    
}
