/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author javier alcalde y daniel perez
 */

/**
 *@param elementos vehiculo de combate.
 *@param nfilas numero de filas.
 *@param ncolumnas numero de columnas.
 */
public class Mapa {
    
//private charcuadrillaMapa; el mapa en sí.
    private char[] elementos;//vehículo de combate
    private byte nfilas; //número de filas
    private byte ncolumnas; // número de columnas

    //constructor
    public Mapa(char[] elementos, byte nfilas, byte ncolumnas) {
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Cuantas filas debe tener el mapa?");
        nfilas=Byte.parseByte(sc.nextLine());
        System.out.println("¿Cuantas columnas debe tener el mapa?");
        ncolumnas=Byte.parseByte(sc.nextLine());
        System.out.println("¿Cuantos ocupa cada vehículo de combate?");
        byte tamaño=Byte.parseByte(sc.nextLine());
        System.out.println("¿Cuantos vehículos de combate hay?");
        byte cant=Byte.parseByte(sc.nextLine()); byte aux=0;
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < tamaño; j++) {
                if(j==0){
                    elementos[aux]='<';
                }else if(j==(tamaño-1)){
                    elementos[aux]='>';
                }else{
                elementos[aux]='-';
                }
            }
        }
        this.elementos = elementos;
        this.nfilas = nfilas;
        this.ncolumnas = ncolumnas;
 
    }
      
    //funcion toString
    public String toString() {
        
        return null;
    }

     //funcion colocarBarcosyAviones   
    public void colocarBarcosyAviones(){
        
    }
    //funcion recibirDisparo
    public boolean recibirDisparo(int posX, int posY){
 
        return true;
    }
    
    //Getter getElementos
    /**
     * 
     * @return elementos-
     */
    public char[] getElementos() {
        return elementos;
    }
    //setter setElementos
    /**
     * 
     * @param elementos 
     */
    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }
    //getter getNfilas
    /**
     * 
     * @return nfilas (byte).
     */
    public byte getNfilas() {
        return nfilas;
    }
    //setter setNfilas
    /**
     * 
     * @param nfilas 
     */
    public void setNfilas(byte nfilas) {
        this.nfilas = nfilas;
    }
    //getter getNcolumnas
    /**
     * 
     * @return ncolumnas (byte).
     */
    public byte getNcolumnas() {
        return ncolumnas;
    }
    //setter setNcolumnas
    /**
     * 
     * @param ncolumnas 
     */
    public void setNcolumnas(byte ncolumnas) {
        this.ncolumnas = ncolumnas;
    }
    
}
