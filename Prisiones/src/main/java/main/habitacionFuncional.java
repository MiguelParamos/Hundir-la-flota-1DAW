package main;


/**
 *Esta es la clase de habitacion funcional que define una habitacion y todo lo relacionado con ella
 * @author Ale Rios
 */
public class HabitacionFuncional extends CosaConNombre{
    private Bloque bloqueAsignado;  // Bloque donde se encuentra la habitacionFuncional
    
    /**
     * Constructor de habitacionFuncional
     * @param nombre (nombre habitacion)
     * @param bloque (numero de bloque)
     */
    public HabitacionFuncional (String nombre, Bloque bloque){
        super(nombre); 
        this.bloqueAsignado = bloque;
    }

    /**
     * El getter de bloque 
     * @return devuelve bloque
     */
    public byte getBloque() {
        return bloqueAsignado;
    }

    /**
     * Setter de bloque
     * @param bloque para crear un bloque
     */
    public void setBloque(Bloque bloque) {
        this.bloqueAsignado = bloque;
    }
    
}
