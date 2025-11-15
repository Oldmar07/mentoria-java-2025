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
public class Ex5 {

    public void ex5() {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[0];
        double maior = 0;
        double maiorIndex = 0;
        int n;
        
        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();
        
        numeros = new double[n];
        System.out.println();
        
        for (int i = 0; i < n; i++){
            System.out.print("Digite o " +(i+1)+ "o numero: ");
            numeros[i] = sc.nextDouble();
            
            if (numeros[i] > maior){
                maior = numeros[i];
                maiorIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("MAIOR NUMERO: " +maior);
        System.out.println("POSICAO DO MAIOR NUMERO: " +maiorIndex);
        
    }
}
