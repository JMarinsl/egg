/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.gria.pkg3;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio2Gria3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que pida una frase y si esa frase es 
        //igual a “eureka” el programa pondrá un mensaje de Correcto,
        //sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese la palabra correcta: ");
        palabra=leer.nextLine();
        Object eureka;
        if (palabra.equals("eureka")){
            System.out.println("escribiste la palabra correcta, felicidades!");
        }
        else {
            System.out.println("palabra incorrecta");
        }
        
    }
    
}
