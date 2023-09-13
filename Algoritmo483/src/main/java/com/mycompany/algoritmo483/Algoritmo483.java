/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo483;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo483 {
    public static void main(String[] args) {
        int L, C;
        int[] num = new int[4];
        int[] num1 = new int[4];
        
        for (L = 0; L < 4; L++) {
            num[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (L + 1) + "º número do vetor A: "));
        }
        
        for (L = 0; L < 4; L++) {
            num1[L] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (L + 1) + "º número do vetor B: "));
        }
        
        C = produtointerno(num, num1, 4);
        
        System.out.println("\nVETOR A\tVETOR B\n");
        for (L = 0; L < 4; L++) {
            System.out.println(num[L] + "\t" + num1[L]);
        }
        
        System.out.println("\nProduto Interno: " + C);
    }
    
    public static int produtointerno(int vet1[], int vet2[], int quant) {
        int prod = 0;
        for (int i = 0; i < quant; i++) {
            prod = prod + (vet1[i] * vet2[i]);
        }
        return prod;
    }
}
