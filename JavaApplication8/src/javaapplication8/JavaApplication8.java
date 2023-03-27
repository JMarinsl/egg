/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
//La fórmula correspondiente es: F = 32 + (9 * C / 5).
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tempC = new Scanner(System.in);
        Double gradosC;
        Double F;
        System.out.println("ingrese temperatura en grados centigrados: ");
        gradosC=tempC.nextDouble();
        F = ((9 * gradosC) / 5) + 32 ;
        System.out.print("la temperatura ingresada es igual a " + F);
        System.out.print(" grados F.");
        
                
        
    }
    
}
