/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
package ejercicio.pkg2.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio2Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String nueva_variable;
        System.out.println("ingrese su nombre");
        nombre=entrada.next();
        nueva_variable=nombre;
        System.out.println("su nombre es: " + nueva_variable);
        
        
    }
    
}
