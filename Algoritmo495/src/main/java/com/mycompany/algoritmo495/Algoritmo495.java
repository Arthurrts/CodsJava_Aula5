/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo495;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo495 {

    public static void main(String[] args) {
        int l;
        String nome[] = new String[5];
        
        for(l = 0; l < 5; l++){
        nome[l] = JOptionPane.showInputDialog("Digite nome: ");
        }
        
        ordena(nome, 5);
        
        System.out.println("\n\nNOMES ORDENADOS\n");
        for(l = 0; l < 5; l++){
            System.out.println("\n" + (l+1) + " - " + nome[l]);
        }
    }  
   
    public static void ordena(String vet[], int tam){
       int l1, c1;
       String aux;
       for(l1 = 0; l1 < tam-1; l1++){
           for(c1 = l1+1; c1 < tam; c1++){
               if(vet[l1].compareTo(vet[c1]) > 0){
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
               }
           }
       }
}
}
