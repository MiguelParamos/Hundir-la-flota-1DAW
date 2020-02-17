/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.time.*;

/**
 * Objeto preso, persona con determinadas funciones
 *
 * @author JAVIER ALCALDE
 */
public class Preso extends Persona {
    
    private short id;
    private String expediente;
    private byte nivelPeligro;
    private short sueldo;
    private Horario horario;
    private Trabajo trabajo;
    private Celda celda;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    
    /**
     * 
     * @param apellido
     * @param dni
     * @param id
     * @param expediente
     * @param nivelPeligro
     * @param sueldo
     * @param horario
     * @param trabajo
     * @param celda
     * @param fechaIngreso
     * @param fechaSalida 
     */
    public Preso(String apellido, String dni, short id, String expediente, byte nivelPeligro, short sueldo, Horario horario, Trabajo trabajo, Celda celda, LocalDate fechaIngreso, LocalDate fechaSalida) {
        super(apellido, dni);
        this.setId(id);
        this.setExpediente(expediente);
        this.setNivelPeligro(nivelPeligro);
        this.setSueldo(sueldo);
        this.setHorario(horario);
        this.setTrabajo(trabajo);
        this.setCelda(celda);
        this.setFechaIngreso(fechaIngreso);
        this.setFechaSalida(fechaSalida);
    }
    
    /**
     * Función trabajar; el preso trabaja por un sueldo
     */
    public void trabajar(){
        
    }
    
    /**
     * Función salirLibre; el preso sale de la prisión si se acaba su condena
     * @return boolean
     */
    public boolean salirLibre(){
        return true;
    }
    
    /**
     * Función sanciona; si el preso actuado mal, se toman medidas en su contra
     * @param tiempoextra se añade tiempo a la condena por alguna causa
     * @param multa multa monetaria
     */
    public void sancionar(LocalDate tiempoextra, short multa){
        
    }
    
    /**
     * Función realizarActividadActual; compruba si el preso realiza sus actividades obligatorias
     */
    public void realizarActividadActual(){
        
    }
    
    
    /**
     * getter de id
     * @return id del preso
     */
    public short getId() {
        return id;
    }
    
    /**
     * Setter de id
     * @param id 
     */
    public void setId(short id) {
        this.id = id;
    }
    
    /**
     * getter de Expediente
     * @return expediente del preso
     */
    public String getExpediente() {
        return expediente;
    }

    /**
     * Setter de Expediente 
     * @param expediente 
     */
    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    /**
     * Getter de NivelPeligro
     * @return que nivel de peligro tiene el preso
     */
    public byte getNivelPeligro() {
        return nivelPeligro;
    }

    /**
     * Setter de NIvelPeligro
     * @param nivelPeligro 
     */
    public void setNivelPeligro(byte nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    /**
     * Getter de sueldo
     * @return sueldo del preso
     */
    public short getSueldo() {
        return sueldo;
    }

    /**
     * Setter de sueldo
     * @param sueldo 
     */
    public void setSueldo(short sueldo) {
        this.sueldo = sueldo;
    }
    
    /**
     * Getter de Horario
     * @return horario del preso
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * Setter de Horario
     * @param horario 
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * Getter de Trabajo
     * @return Trabajo a realizar por el preso
     */
    public Trabajo getTrabajo() {
        return trabajo;
    }

    /**
     * Setter de Trabajo
     * @param trabajo 
     */
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    /**
     * Getter de Celda
     * @return numero de celda del preso
     */
    public Celda getCelda() {
        return celda;
    }

    /**
     * Setter de Celda
     * @param celda 
     */
    public void setCelda(Celda celda) {
        this.celda = celda;
    }

    /**
     * Setter de FechaIngreso
     * @return Fecha en la que el preso ingresa en prisión
     */
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    /**
     * Setter de FechaIngreso
     * @param fechaIngreso 
     */
    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Getter de FechaSalida
     * @return Fecha en la que termina la condena del preso
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     * Sstter de FechaSalida
     * @param fechaSalida 
     */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
            
    
    
}
