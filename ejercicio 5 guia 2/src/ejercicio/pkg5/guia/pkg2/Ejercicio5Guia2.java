/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio5Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo,
        //y a continuación solicite números al usuario hasta que la suma de 
        //los números introducidos supere el límite inicial.
        
        Scanner leer = new Scanner (System.in);
        int numeroLimite;
        int numeros=0;
        int i=0;
        int z=0;
                
        System.out.println("ingrese un valor limite positivo");
        numeroLimite=leer.nextInt();
        System.out.println("ahora ingrese numeros hasta superar el limite");
        while(z<=numeroLimite){
            numeros=leer.nextInt();
            z = numeros+z;
            
            
        }
        System.out.println("la suma de los numeros ingresados es "+z);
    }
    
}
