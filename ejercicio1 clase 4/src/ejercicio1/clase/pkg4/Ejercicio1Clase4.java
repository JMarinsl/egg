/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.clase.pkg4;

import java.util.Scanner;



/**
 *
 * @author John
 */
public class Ejercicio1Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero: ");
        num = entrada.nextInt();
        if(num % 2 == 0){
        System.out.println(num + " es un numero par");
    } 
        else if(num % 2 != 0){
                System.out.println(num + " es un numero impar");
                }
            
    
    }
}    

