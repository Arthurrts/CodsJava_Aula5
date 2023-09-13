/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo487;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo487 {

    public static void main(String[] args) {
        int L;
        int[] num = new int[10];
        
        for(L = 0; L < 10; L++){
            num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (L+1) + ": "));
        }
        
        inverte(num, 10);
        
        System.out.println("\nVETOR\n");
        for(L = 0; L < 10; L++){
            System.out.println("\n" + (L+1) + " - " + num[L]);
        }
    }
    
    public static void inverte(int vet[], int max){
        int k, i, aux;
        k = max;
        for(i = 0; i < max / 2; i++){
            aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
    
}
