/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo490;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo490 {

    public static void main(String[] args) {
        String nome[] = new String[10];
        int l;
        
        for(l = 0; l < 10; l++){
            nome[l] = JOptionPane.showInputDialog("Digite palavras em letras minúsculas " + (l + 1) + ":");
            nome[l] = restantes(nome[l], "c");
        }
        
        for (l = 0; l < 10; l++) {
            System.out.println((l + 1) + " - " + nome[l] + "\n");
        }
    }
    
    public static String restantes(String vet, String x){
        return vet.replace(x, "*");
    }
}