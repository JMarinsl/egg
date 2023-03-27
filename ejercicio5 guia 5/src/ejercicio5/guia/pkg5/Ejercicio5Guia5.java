/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejercicio5Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
        
        
        res(matriz);
        
        
    }
    public static void res(int[][] matriz){
    boolean resultado=true;
    for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(matriz[i][j]==(-matriz[j][i])){
                    resultado=true;
                }
            }
            }
    if (resultado){
        System.out.println("la matriz no es antisimetrica");
    }
    else {
        System.out.println("la matriz es antisimetrica");
    }
    } 
}
