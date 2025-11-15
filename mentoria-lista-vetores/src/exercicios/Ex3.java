/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import entidades.Pessoa;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Ex3 {

    public void ex3() {
        Scanner sc = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[0];
        int n;
        int numPessoasAbaixo16 = 0;
        float sumAlturas = 0;

        System.out.print("Quantas pessoas deseja registrar? ");
        n = sc.nextInt();

        pessoas = new Pessoa[n];
        System.out.println();

        for (int i = 0; i < n; i++) {
            pessoas[i] = new Pessoa();
            System.out.println();
            sc.nextLine();
            System.out.println("PESSOA #" + (i + 1) + ":");
            System.out.print("Nome: ");
            pessoas[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(sc.nextInt());
            System.out.print("Altura: ");
            pessoas[i].setAltura(sc.nextFloat());

            sumAlturas += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16) {
                numPessoasAbaixo16 += 1;
            }
        }
        
        System.out.println();
        float mediaAlturas = sumAlturas / n;
        System.out.printf("A media das alturas e %.2f m.\n", mediaAlturas);
        if (numPessoasAbaixo16 > 0) {
            int percentagemMenor16 = (numPessoasAbaixo16 * 100) / n;
            System.out.println("A percentagem de pessoas com menos de 16 anos e: " + percentagemMenor16 + " %.");
            System.out.println();
            System.out.println("PESSOAS COM MENOS DE 16 ANOS: ");
            for (Pessoa p : pessoas) {
                if (p.getIdade() < 16){
                    System.out.println(p.getNome());
                }
            }
        }
        else{
            System.out.println("Nao ha pessoas com menos de 16 anos.");
        }

    }
}
