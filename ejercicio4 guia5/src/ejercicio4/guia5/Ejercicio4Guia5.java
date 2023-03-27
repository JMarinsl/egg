/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.guia5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio4Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que rellene un matriz de 4 x 4 de valores
        //aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta
        //de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
        
        int matriz[][]=new int[3][3];
        int matrizT[][]=new int[3][3];
        Scanner leer=new Scanner (System.in);
        System.out.println("ingrese los valores de la matriz");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                
                matriz[i][j]=leer.nextInt();
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
            } 
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrizT[j][i]=matriz[i][j];  
            }
            }
        System.out.println("mostrando la matriz transpuesta...");
        System.out.println("");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matrizT[i][j]);
            }System.out.println("");
            }
        
    }
    
}
