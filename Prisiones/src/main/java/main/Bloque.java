/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author M.J.H
 */
public class Bloque {
    private byte nbloque;
    private Celda [] celda;
    private HabitacionFuncional [] HabitacionFuncional;
    private Baños [] Baños;
        public Bloque(byte b){
        setBloque(b);
        
    }
    public byte getBloque() {
      return nbloque;
   }
   public void setBloque(byte nbloque) {
      this.nbloque = nbloque;

    }
}
