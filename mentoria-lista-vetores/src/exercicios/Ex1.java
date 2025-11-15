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
public class Ex1 {

    public void ex1() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[0];
        int n;

        do {
            System.out.print("Quantos numeros deseja ler? ");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("Digite um numero menor ou igual a 10.");
            }
        } while (n > 10);

        numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Diginte o " +(i+1)+ "o numero: ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Numeros negativos: ");
        for (int numero: numeros){
            if (numero < 0){
                System.out.println(numero);
            }
        }
    }
}
