/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio3Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Recorrer un vector de N enteros contabilizando cuántos números
       //son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner leer = new Scanner (System.in);
        int N;
       
        System.out.println("de que tamaño sera tu vector?");
        N=leer.nextInt();
        int[] vector=new int [N];
       for (int i=0;i<N;i++){
           vector[i]=(int)(Math.random()*20000);
       }
       for (int i=0;i<N;i++){
            System.out.print("["+ vector[i] +"]");
           System.out.println(" ");
       }
       for (int i=0;i<N;i++){
           if (vector[i]>0 && vector[i]<10){
           System.out.println("el numero " + i + " es de 1 digito");
       }
           else if(vector[i]>=10 && vector[i]<100){
               System.out.println("el numero " + i + " es de 2 digitos");
           }
           else if(vector[i]>=100 && vector[i]<1000){
               System.out.println("el numero " + i + " es de 3 digitos");
       }
           else if(vector[i]>=1000 && vector[i]<10000){
               System.out.println("el numero " + i + " es de 4 digitos");
           }
           else if(vector[i]>=10000 && vector[i]<1000000){
               System.out.println("el numero " + i + " es de 5 digitos");
           }
       
       
    }
    
    }
}
