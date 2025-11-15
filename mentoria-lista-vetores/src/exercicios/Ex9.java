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
public class Ex9 {

    public void ex9() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[0];
        int[] idades = new int[0];
        int maiorIdade = 0;
        String nomeMaisVelho = null;
        int n;

        System.out.print("Quantas pessoas voce vai ler? ");
        n = sc.nextInt();

        idades = new int[n];
        nomes = new String[n];
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a Pessoa:");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("------------------------------");
            
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }
        
        System.out.println();
        System.out.println("PESSOA MAIS VELHA: " +nomeMaisVelho);
        System.out.println();
    }
}
