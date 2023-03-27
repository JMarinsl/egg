/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8.guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio8Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
        //Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
   //* * * *
   //*     * 
   //*     *
   //* * * *
        
        Scanner leer = new Scanner (System.in);
        int num,i;
        System.out.println("de que tamaño quieres los lados?:");
        num=leer.nextInt();
        
        if(num >0 && num<30){
            
            
            for(i=0;i<num;i++ ){
                System.out.print("*");
            }
            System.out.println();
            
            for(i=0;i<num-2;i++ ){
                System.out.print("*");
                for(int j=0;j<num-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            for(i=0;i<num;i++ ){
                System.out.print("*");
            
        }

    }
    
}
}