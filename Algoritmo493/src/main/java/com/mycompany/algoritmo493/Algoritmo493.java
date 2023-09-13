/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo493;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo493 {

    public static void main(String[] args) {
        int l, c;
        int[] num = new int[10];
        
        for(l = 0; l < 10; l++){
            num[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero " + (l+1) + ": "));
        }
        
        c = verificaordem(num, 10);
        
        if(c == 1){
            System.out.println("\nORDEM CRESCENTE");
        }
        else if (c == 2){
            System.out.println("\nORDEM DECRESCENTE");
        }
        else{
            System.out.println("\nNAO ESTA EM ORDEM");
        }
    }
    
    public static int busca(int vet[], int tam){
        int i, x;
        for(i = 0; i<tam-1; i++){
            if(vet[i] < vet[i+1]){
                x = 0; return(x);
            }
        }
        x = 1; return(x);
    }
    
    public static int busca1(int vet[], int tam){
        int i, x;
        for(i = 0; i<tam-1; i++){
            if(vet[i] > vet[i+1]){
                x = 0; return(x);
            }
        }
        x = 1; return(x);
    }
    
    public static int verificaordem(int vetor[], int t){
        int r, res;
        
        r = busca(vetor, t);
        if(r == 1){
            res = 2; return(res);
        }
        else{
            r = busca1(vetor, t);
            if(r == 1){
                res = 1; return(res);
            }
            else{
                res = 0; return(res);
            }
        }
    }
}
