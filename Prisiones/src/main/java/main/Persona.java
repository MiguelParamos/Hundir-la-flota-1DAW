/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 * Descripción clase Persona: Clase que define a las personas.
 * @author Raúl González Parra
 */
public class Persona extends CosaConNombre{
    
    private String apellido;//Apellido de las personas.
    private String dni;//Identificación de las personas.
    
    /**
     * Descripción constructor Persona: Define a las personas junto a sus características.
     * @param a Parámetro que recibe el apellido de las personas.
     * @param d Parámetro que recibe el DNI de las personas.
     */
    public Persona(String a, String d){
    super("nombre");
    this.setApellido(a);
    this.setDni(dni);
    
} 

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
}
