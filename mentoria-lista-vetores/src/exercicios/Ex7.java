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
public class Ex7 {

    public void ex7() {
        Scanner sc = new Scanner(System.in);
        float[] numeros = new float[0];
        int somaVetor = 0;
        float media = 0;
        int abaixo = 0;
        int n;

        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();

        numeros = new float[n];
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            numeros[i] = sc.nextFloat();
            somaVetor += numeros[i];
            abaixo += 1;
        }

        media = somaVetor / n;
        System.out.println();

        System.out.printf("MEDIA DO VETOR: %.3f\n", media);
        System.out.println();

        if (abaixo > 0) {
            System.out.print("NUMEROS ABAIXO DA MEDIA: ");
            for (float num : numeros) {
                if (num < media) {
                    System.out.print("[" +num+ "] ");
                }
            }
        } else {
            System.out.println("NAO HA NUMEROS ABAIXO DA MEDIA.");
        }
        System.out.println();
    }
}
