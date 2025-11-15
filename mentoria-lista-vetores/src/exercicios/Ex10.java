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
public class Ex10 {

    public void ex10() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[0];
        float[] notas1 = new float[0];
        float[] notas2 = new float[0];
        float[] medias = new float[0];
        int n;
        int aprovados = 0;

        System.out.print("Quantos alunos voce vai ler? ");
        n = sc.nextInt();
        
        nomes = new String[n];
        notas1 = new float[n];
        notas2 = new float[n];
        medias = new float[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Digite os dados do " + (i + 1) + "o aluno: ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Nota do 1o Semestre: ");
            notas1[i] = sc.nextFloat();
            System.out.print("Nota do 2o Semeste: ");
            notas2[i] = sc.nextFloat();
            System.out.println("-----------------------");

            medias[i] = (notas1[i] + notas2[2]) / 2;
            if (medias[i] > 6.0) {
                aprovados += 1;
            }
        }

        System.out.println();

        if (aprovados > 0) {
            System.out.println("ALUNOS APROVADOS: ");
            for (int i = 0; i < n; i++) {
                if (medias[i] > 6.0) {
                    System.out.println(nomes[i] + " com a media " + medias[i] + ".");
                }
            }
        } else {
            System.out.println("NAO HA ALUNOS APOROVADOS!");
        }
    }
}
