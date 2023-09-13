/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo485;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo485 {

    public static void main(String[] args) {
        int L;
        int[] num = new int[6];
        String[] num1 = new String[6];
        
        for(L = 0; L < 6; L++){
            num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: " + (L+1) + ": "));
        }
        
        for(L = 0; L < 6; L++){
            num1[L] = JOptionPane.showInputDialog("Digite caractere: " + (L+1) + ": ");
        }
        System.out.println("\n");
        
        multivetor(num, num1, 6);
    }
    
   public static void multivetor(int vet1[], String vet2[], int tam){
       int I, W;
       for(I = 0; I < tam; I++){
           System.out.println("\n");
           for(W = 0; W < vet1[I]; W++){
               System.out.println(vet2[I]);
           }
       }
   }
}
