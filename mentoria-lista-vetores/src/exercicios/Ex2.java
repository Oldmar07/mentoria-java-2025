/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Ex2 {
    public void ex2(){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[0];
        double soma = 0;
        double media = 0;
        int n;
        
        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();
        
        numeros = new double[n];
        System.out.println();
        
        for (int i = 0; i < n; i++){
            System.out.print("Digite o " +(i+1)+ "o numero: ");
            numeros[i] = sc.nextDouble();
        }
        
        System.out.println();
        System.out.print("VALORES LIDOS: ");
        for (double num: numeros){
            System.out.print(num+" | ");
            soma += num;
        }
        
        media = soma / n;
        System.out.println();
        System.out.println("SOMA DOS NUMEROS: " +soma);
        System.out.println("MEDIA DOS NUMEROS: " +media);
    }
}
