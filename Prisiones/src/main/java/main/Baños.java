/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Clase baños de la prisión
 * @author Silvia SB
 */
public class Baños {
    private byte nDuchas; // numero de duchas de cada baño
    private Preso[] presos;// array de presos en la ducha

    /**
     * Constructor de Baños
     * @param nDuchas nº de duchas por baño
     * @param presos preso en cada baño
     */
  public Baños (byte nDuchas, Preso[] presos){
        this.setnDuchas(nDuchas);
        this.setPresos(presos);

    }    
    
    /**
     * getter de nDuchas
     * @return nDuchas
     */
    public byte getnDuchas() {
        return nDuchas;
    }
 /**
     * getter de Presos
     * @return presos
     */
    public Preso[] getPresos() {
        return presos;
    }
 /**
     * setter de nDuchas
     * @return nDuchas
     */
    public void setnDuchas(byte nDuchas) {
        this.nDuchas = nDuchas;
    }
 /**
     * getter de presos
     * @return presos
     */
    public void setPresos(Preso[] presos) {
        this.presos = presos;
    }
 /**
  * Función para cuando un preso entra en el baño
  * @param p el preso que entra
  */   
    public void presoEntra (Preso p){
   
    }
 /**    
  * Función para cuando sale un preso en el baño
  * @param p el preso que sale
  */
    public void presoSale (Preso p){
   
    }    
    
 
    
}
