/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo499;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo499 {

    public static void main(String[] args) {
        int l, flag, op;
        flag = 0;
        int[] num = new int[5];
        
        for(l=0; l<5; l++){
            num[l] = 0;
        }
        
        do{
            System.out.println("\n\n\nMENU VETOR - FUNCAO\n");
            System.out.println("1 - Dados do VETOR");
            System.out.println("2 - Ordena VETOR");
            System.out.println("3 - Imprime VETOR");
            System.out.println("4 - Sai do programa\n");
            op = Integer.parseInt(JOptionPane.showInputDialog("OPCAO: "));
            
            switch (op){
            case 1: entrada(num, 5);
                    flag = 1;
                    break;
                    
            case 2: if(flag == 1){
                        ordena(num, 5);
                        System.out.println("Ordenado.");
                    }else{
                        System.out.println("Escolha primeiro opcao 1.");
                    }
                    break;
                    
            case 3: if(flag == 1){
                        imprime(num, 5);
                    }else{
                        System.out.println("Escolha primeiro opcao 1.");
                    }
                    break;
                
            case 4: System.out.println("Saindo do Algoritmo.");
                    break;
            
            default: System.out.println("Opcao invalida.");
                     break;
            }
        }
        while(op != 4);
    }
    
    public static void entrada(int vet[], int t){
        int l;
        
        System.out.println("Entrada do VETOR");
        for(l=0;l<t;l++){
            vet[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite numero "+(l+1)+" : "));
        }
    }
    
    public static void imprime(int vet[], int t){
        int x;
        
        System.out.println("\nVETOR");
        for(x=0;x<t;x++){
            System.out.println((x+1) +" - "+ vet[x]);
        }
    }
    
    public static void ordena(int vet[], int tam){
        int y1, c1, aux;
        
        for(y1=0; y1<tam -1; y1++){
            for(c1 = y1+1; c1<tam; c1++){
                if(vet[y1] > vet[c1]){
                    aux = vet[y1];
                    vet[y1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }
}
