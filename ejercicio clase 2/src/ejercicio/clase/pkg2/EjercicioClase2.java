/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class EjercicioClase2 {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        int num1;
//        int num2;
//        int res;
        System.out.println("Ingrese dos números:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int res = num1+num2;
        System.out.println("El resultado de la suma es :" + res);


    }
        
    }
    
    
    
    

