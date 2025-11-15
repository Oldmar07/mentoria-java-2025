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
public class Ex8 {

    public void ex8() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[0];
        int somaPar = 0;
        int totPar = 0;
        int n;

        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();

        numeros = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPar += numeros[i];
                totPar += 1;
            }
        }

        if (totPar > 0) {
            float mediaPar = somaPar / totPar;
            System.out.println("MEDIA DOS NUMEROS PARES: " + mediaPar);
            System.out.println();
        } else {
            System.out.println("NAO HA NUMEROS PARES! IMPOSSIVEL CALCULAR A MEDIA.");
        }
    }
}
