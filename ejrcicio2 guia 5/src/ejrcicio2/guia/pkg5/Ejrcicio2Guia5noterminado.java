/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrcicio2.guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejrcicio2Guia5noterminado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un algoritmo que llene un vector de tamaño N con
        //valores aleatorios y le pida al usuario un número a buscar en el vector.
        //El programa mostrará dónde se encuentra el numero y si se encuentra repetido
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del vector:");
        int [] vector = new int[sc.nextInt()];
        System.out.println(" ");
        System.out.println("Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10);
             System.out.println(""+vector[i]);
        }
        System.out.println("Adivine el número del 0 al 9");
        int adivinar = sc.nextInt(), cont=0;
        
        for (int i = 0; i < vector.length; i++) {
            if (adivinar == vector[i]) {
                cont++;
                System.out.println("Adivinaste!!! El número se encuentra en la ubicación: "+(i+1));
            }else if (true) {
                
            }
           
        }System.out.println("el numero no esta en el vector");
    }
    
}
        
        
    