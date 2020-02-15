/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *Clase guardia donde alojaremos todo lo relacionado al guardia
 * @author nico
 */
public class  Guardia extends Persona {
    private char turno;//turno del guardia
    private Trabajo trabajoQueSupervisa;//Trabajo de quien supervisa
    private Horario horario;//Horario del guardia
    private Bloque bloqueAsignado//Bloque donde le corresponde el guardia
    /**
     * Constructor de Guardia con todos los campos
     * @param nombre del guardia
     * @param apellido del guardia
     * @param nif del guardia
     * @param turno del guardia
     * @param trabajoQueSupervisa el guardia
     * @param horario del guardia
     * @param bloqueAasignado  bloque se le asigna al guardia
     */
            public Guardia(String nombre, String apellido, String nif ,char turno,
                    Trabajo trabajoQueSupervisa ,Horario horario, Bloque bloqueAasignado){
                super(nombre,apellido,nif);
                this.turno=turno;
                this.horario=horario;
                this.trabajoQueSupervisa=trabajoQueSupervisa;
                this.bloqueAsignado=bloqueAsignado;
                
                  
            }
            /**
             * Funcion que realiza la actividad del guardia
             * @return la actividad
             */
           public String realizarActividadActual(){
               return null; 
           }  
/**
 * Getter de turno
 * @return turno
 */
    public char getTurno() {
        return turno;
    }
/**
 * Getter del trabajoQueSupervisa
 * @return dicho trabajo
 */
    public Trabajo getTrabajoQueSupervisa() {
        return trabajoQueSupervisa;
    }
/**
 *Getter del horario 
 * @return dicho horario
 */
    public Horario getHorario() {
        return horario;
    }
/**
 * Getter del bloque
 * @return bloqueAsignado
 */
    public Bloque getBloqueAsignado() {
        return bloqueAsignado;
    }
/**
 * Setter de turno
 * @param turno  asignar turno del guardia
 */
    public final void setTurno(char turno) {
        this.turno = turno;
    }
/**
 * Setter del trabajo
 * @param trabajoQueSupervisa Asignar trabajo al guardia
 */
    public void setTrabajoQueSupervisa(Trabajo trabajoQueSupervisa) {
        this.trabajoQueSupervisa = trabajoQueSupervisa;
    }
/**
 * Setter del horario
 * @param horario Parametro para asignar horario del guradia
 */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
/**
 * Setter del bloque
 * @param bloqueAsignado Asignar bloque donde se encuentra el Guardia
 */
    public void setBloqueAsignado(Bloque bloqueAsignado) {
        this.bloqueAsignado = bloqueAsignado;
    }
    
    /**
     * método que concatena en un string todos los datos de un Guardia
     * @return todos los datos del Guardia
     */
    public String toString() {
          String aux="";
        aux+="Nombre: "+this.getNombre()+"";
        aux+="Apellido "+this.getApellido()+"\n";
        aux+="Nif: "+this.getNif()+"\n";
        aux+="turno"+this.getTurno()+"\n";
        aux+="Trabajo "+this.getTrabajoQueSupervisa()+"\n";
        aux+="Horario: "+this.getHorario()+"\n";
        aux+="Bloque "+this.getBloqueAsignado()+"\n";
        return aux;
    }
        
           
         
            
     
    
    
}
