package main;


/**
 *Esta es la clase de habitacion funcional que define una habitacion y todo lo relacionado con ella
 * @author Ale
 */
public class HabitacionFuncional extends CosaConNombre{
    private byte bloque; // Numero de bloque
    
    /**
     * Constructor de habitacionFuncional
     * @param nombre (nombre habitacion)
     * @param bloque (numero de bloque)
     */
    public HabitacionFuncional (String nombre, byte bloque){
        super(nombre); 
        this.bloque = bloque;
    }

    /**
     * El getter de bloque 
     * @return devuelve bloque
     */
    public byte getBloque() {
        return bloque;
    }

 
    public void setBloque(byte bloque) {
        this.bloque = bloque;
    }
    
}
