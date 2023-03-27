/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
//El programa deberá después mostrar el resultado de la suma
package ejercicio.pkg1.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio1Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int entero1;
        int entero2;
        int entero3;
        int resultado;
        System.out.println("ingrese numero 1: ");
        entero1=leer.nextInt();
        System.out.println("ingrese numero 2: ");
        entero2=leer.nextInt();
        resultado=entero1+entero2;
        System.out.println("el resultado de la suma es: " + resultado);
        
        
        
        
        
        
    }
    
}
