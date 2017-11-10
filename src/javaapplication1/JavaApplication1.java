/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro:");
        int n1 = scan.nextInt();
        System.out.println("Entre com mais um número inteiro: ");
        int n2 = scan.nextInt();
        int sub = n1 - n2;
        System.out.println("O resultado da subtracao entre " + n1 + " e " + n2 + " é " + sub);
    } 
}
