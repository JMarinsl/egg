/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje.pkg1.guia.pkg5;

/**
 *
 * @author John
 */
public class Eje1Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector= new int[100];
        
        for (int i=0; i<100;i++){
        vector[i]=i;
        }
        for(int i=0; i<100;i++){
            System.out.println("[" + vector[99-i]+"]");
        }
        
        
        
        
        
        
    }
    
}
