/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo481;
import javax.swing.JOptionPane;

/**
 *
 * @author thuts
 */
public class Algoritmo481 {

    public static void main(String[] args) {
        int num, base, c;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite numero maior ou igual a 0:"));
        while(num < 0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero negativo. Digite um numero maior ou igual a 0:"));        
        }
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base em que deseja representa-lo(2-10)"));
        while(base < 2 || base > 10){
            base = Integer.parseInt(JOptionPane.showInputDialog("Nao sei converter. Digite a base em que deseja representa-lo(2-10)"));
        }
        
        c = converte(num, base);
        
        System.out.println("Numero em decimal:" + num);
        System.out.println("Numero na base: " + base + ": " + c);
    }
    
        public static int converte(int numero, int numerobase){
            
        int numerob = 0;
        int b = 0;
        int r;

        while(numero >= numerobase){
            r = numero % numerobase;
            numerob = (int) (numerob + Math.pow(10, b) * r);
            numero = numero / numerobase;
            b++;
        }
        numerob = (int) (numerob + Math.pow(10,b) * numero);
        return numerob; 
    }
}
