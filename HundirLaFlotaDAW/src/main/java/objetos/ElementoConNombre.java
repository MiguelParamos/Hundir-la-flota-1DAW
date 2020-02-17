/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *Clase ElementoConNombre
 * @author Ale Ríos
 */
public class ElementoConNombre {
    /**
 * 
 * 
 */

    private String nombre;

    public ElementoConNombre(String n){
        setNombre(n);
    }
    
    //Getter
    public String getNombre(){
        return nombre;
    }
    
    //Setter
    public final void setNombre(String n){
        nombre = n;
    }
}


