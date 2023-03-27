/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio3Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        String frase;
        System.out.println("escriba una frase");
        frase=entrada.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
        
    }
    
}
