/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        //Si el usuario ingresa una frase o palabra de 8 de largo se deberá
        //de imprimir un mensaje por pantalla que diga “CORRECTO”,
        //en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
        
        Scanner leer = new Scanner (System.in);
        String palabra;
        String caracter;
        String seguir="s";
        
        
        
        while(seguir.equals("s")){
        
        System.out.println("ingrese una palabra de 8 digitos");
        palabra = leer.nextLine();
        
        
            
        
        if (palabra.length()==8){
            System.out.println("CORRECTO");
        }
        else if(palabra.length()!=8){
            System.out.println("INCORRECTO");
        }
            System.out.println("intentar nuevamente?");
            System.out.println("Si=s");
            System.out.println("No=n");
            
            seguir=leer.nextLine();
       
        }
    }       
}
