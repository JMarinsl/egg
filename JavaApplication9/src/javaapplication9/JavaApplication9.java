/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número.
package javaapplication9;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        Double num;
        System.out.println("ingrese un numero: ");
        num = valor.nextDouble();
        Double doble = (num)*2;
        Double triple = (num)*3;
        Double raiz = sqrt(num);
       
        System.out.println("el doble del valor ingresado es: " + doble);
        System.out.println("el triple del valor ingresado es: " + triple);
        System.out.println("la raiz cuadrada del valor ingresado es: " + raiz);
        
        
        
        
    }
    
}
