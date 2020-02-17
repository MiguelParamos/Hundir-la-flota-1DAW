package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M.J.H
 */
public class CosaConNombre {
    private String nombre;
    
    public CosaConNombre(String n){
        setNombre(n);
    }
    
    /**
     * @param args the command line arguments
     */
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;

    }
    
}