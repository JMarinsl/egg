/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4.ejercicio.teoria;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Clase4EjercicioTeoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno
        //de ellos es mayor a 25.
    
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("ingrese un numero: ");
        num1 = leer.nextInt();
        System.out.println("ingrese otro numero: ");
        num2 = leer.nextInt();
        
        if (num1>25 & num2>25){
            System.out.println(" ambos numeros son mayores que 25");
        }
        else if (num1>25 & num2<25){
            System.out.println(num1 + " es mayor que 25");
        }
        else if (num2>25 & num1<25){
            System.out.println(num2 + " es mayor que 25");
        }
        else {
            System.out.println("ambos numeros son menores que 25");
        }
        
        
        
    }
    
}
