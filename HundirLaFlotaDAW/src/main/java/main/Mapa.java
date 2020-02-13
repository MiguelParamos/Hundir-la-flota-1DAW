/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 2DAW
 */
public class Mapa {
    
//private charcuadrillaMapa; el mapa en sí.
    private char[] elementos;//vehículo de combate
    private byte nfilas;
    private byte ncolumnas;

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
      
    
    public String toString() {
        
        return null;
    }

        
    public void colocarBarcosyAviones(){
        
    }
    
    public boolean reccibirDisparo(int posX, int posY){
 
        return true;
    }
    
    
    public char[] getElementos() {
        return elementos;
    }

    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }

    public byte getNfilas() {
        return nfilas;
    }

    public void setNfilas(byte nfilas) {
        this.nfilas = nfilas;
    }

    public byte getNcolumnas() {
        return ncolumnas;
    }

    public void setNcolumnas(byte ncolumnas) {
        this.ncolumnas = ncolumnas;
    }
    
}
