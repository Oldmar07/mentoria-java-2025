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
public class Ex11 {

    public void ex11() {
        Scanner sc = new Scanner(System.in);
        float[] alturas = new float[0];
        char[] sexos = new char[0];
        int n;
        int numHomens = 0;
        float maiorAltura = 0;
        float menorAltura = 0;

        System.out.print("Quantas pessoas voce vai ler? ");
        n = sc.nextInt();

        alturas = new float[n];
        sexos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Altura: ");
            alturas[i] = sc.nextFloat();
            System.out.print("Sexo (M/F): ");
            sexos[i] = sc.next().charAt(0);
            System.out.println("------------------------------");

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (i == 0) {
                menorAltura = alturas[i];
            } else if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            
            if (sexos[i] == 'M' || sexos[i] == 'm'){
                numHomens += 1;
            }
        }
        
     System.out.println();
     System.out.println("---------- RESULTADOS --------------");
     System.out.println("MENOR ALTURA: " +menorAltura+ " m.");
     System.out.println("MAIOR ALTURA: " +maiorAltura+ " m.");
     System.out.println("NUMERO DE HOMENS: " +numHomens);
     System.out.println();
    }
}
