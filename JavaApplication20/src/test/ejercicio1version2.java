package test;

import java.util.Scanner;

public class ejercicio1version2 {
      public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
        
   
     //Llenado del Vector
       
       int [] vector = new int [101];
      // for (int i = 99; i >= 0; i--) {
        for (int i =100; i > 0; i--) {
       vector[i] = i;
         System.out.println("["+vector[i]+ "]");
       }
    
    }
    }
