/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6guia2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio6guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que pida dos números enteros positivos por teclado
        //y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
        //y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
        //El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
        //si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        //se debe mostrar el siguiente mensaje de confirmación:
        //¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona
        //el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        
        Scanner leer = new Scanner (System.in);
        int opcion,salir = 0, suma, resta,mult,div;
        int num1, num2;
        System.out.println("Ingrese dos valores positivos");
        num1=leer.nextInt();
        num2=leer.nextInt();
       
       
        
        do {
            System.out.println(" ");
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija una opcion:");
        
        
        
        opcion=leer.nextInt();
        switch(opcion){
            
            case 1:
                suma=num1+num2;
                System.out.println("la suma de los numeros ingresados es "+suma);
                break;
            case 2:
                resta=num1-num2;
                System.out.println("La resta de los numeros ingresados es "+resta);
                break;
            case 3:
                mult=num1*num2;
                       System.out.println("La multiplicacion de los numeros ingresados es "+mult);
                       break;
            case 4:
                div=num1/num2;
                System.out.println("la division de los numeros ingresados es"+div);
                break;
               
            case 5:
                
                System.out.println("estas seguro que deseas salir? si=1, no=2");
                salir=leer.nextInt();
                if(salir==1){
                    System.out.println("PROGRAMA FINALIZADO");
                }
                else{
                    break;
                }
                
                }
               
        
    }while(salir != 1);
    
        }

}

