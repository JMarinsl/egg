/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.guia.pkg3;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio1Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una aplicación que le pida dos números al usuario y este
        //pueda elegir entre sumar, restar, multiplicar y dividir.
        //La aplicación debe tener una función para cada operación matemática
        //y deben devolver sus resultados para imprimirlos en el main
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int num1;
        int num2;
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
       
        
        int opcion;
        opcion=leer.nextInt();
        switch (opcion){
            case 1:
                int result1;
                result1 = sumar(num1, num2);
                System.out.println(result1);
                break;
            case 2:
                 int result2;
                result2 = restar(num1,num2);
                System.out.println(result2);
                break;
            case 3:
                int result3;
                result3=multiplic(num1,num2);
                System.out.println(result3);
                break;
            case 4:
                int result4;
                result4=division(num1,num2);
                System.out.println(result4);
                break;
                
          
            
        } 
        
        
    }
    public static int sumar(int num1, int num2){
        int suma=num1+num2;
        
        return suma;
    }
      public static int restar(int num1,int num2){
          int resta = num1-num2;
          
          return resta;
      }
    public static int multiplic(int num1, int num2){
    int mult= num1*num2;
    return mult;
    }
    public static int division(int num1, int num2){
    int div= num1/num2;
    return div;
    }
}
