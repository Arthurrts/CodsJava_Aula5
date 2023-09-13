/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo494;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo494 {

    public static void main(String[] args) {
        int l, c, t, t1;
        String nome[] = new String[3];
        String prof[] = new String[3];
        String ender[] = new String[3];
        
        for(l = 0; l < 3; l++){
            nome[l] = JOptionPane.showInputDialog("Digite nome: ");
            ender[l] = JOptionPane.showInputDialog("Digite endereco: ");
            prof[l] = JOptionPane.showInputDialog("Digite profissao: ");
        }
        
        for(l = 0; l < 2; l++){
            for(c = l+1; c < 3; c++){
                 if(nome[l].compareTo(nome[c]) > 0){
                    troca(nome, l, c);
                    troca(ender, l, c);
                    troca(prof, l, c); 
                }
            }
        }
        
        for(l = 0; l < 3; l++){
            System.out.println("\n" + nome[l] + "\t" + ender[l] + "\t" + prof[l]);
        }
    }
   
    public static void troca(String vet[], int n1, int n2) {
        String aux = vet[n1];
        vet[n1] = vet[n2];
        vet[n2] = aux;
    }
}
