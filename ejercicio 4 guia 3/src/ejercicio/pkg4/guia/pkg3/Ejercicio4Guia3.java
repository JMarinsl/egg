/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.guia.pkg3;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio4Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera 
        //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
        //de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
        //se deberá imprimir “INCORRECTO”. 
        //Nota: investigar la función Substring y equals() de Java.
        Scanner leer=new Scanner (System.in);
        String palabra;
        
        System.out.println("ingrese una palabra que empiece con la letra A");
        palabra=leer.nextLine();
        
              
        if(palabra.substring(0,1).equals("A")){
            System.out.println("CORRECTO");
    }
        else{
            System.out.println("INCORRECTO");
        }
    
    }
}