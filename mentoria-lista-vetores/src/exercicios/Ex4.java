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
public class Ex4 {

    public void ex4() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[0];
        int totalPares = 0;
        int n;

        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();

        numeros = new int[n];
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " | ");
                totalPares += 1;
            }
        }
        System.out.println();
        System.out.println();
        if (totalPares < 0) {
            System.out.println("Nao ha nenhum numero PAR.");
        } else {
            System.out.println("TOTAL DE PARES: " + totalPares);
        }
    }
}
