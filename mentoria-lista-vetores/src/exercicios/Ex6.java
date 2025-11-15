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
public class Ex6 {

    public void ex6() {
        Scanner sc = new Scanner(System.in);
        int[] vetA = new int[0];
        int[] vetB = new int[0];
        int[] vetC = new int[0];
        int n;

        System.out.print("Quantos numeros voce vai ler? ");
        n = sc.nextInt();

        vetA = new int[n];
        vetB = new int[n];
        vetC = new int[n];
        
        System.out.println();
        System.out.println("<--- VETOR A --->");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vetA[i] = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("<--- VETOR B --->");
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            vetB[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            vetC[i] = vetA[i] + vetB[i];
        }
        
        System.out.println();
        System.out.println("<------ RESULTADOS ------>");
        System.out.print("VETOR A: ");
        for (int num: vetA){
            System.out.print("[" +num+ "]");
        }
        
        System.out.println();
        System.out.print("VETOR B: ");
        for (int num: vetB){
            System.out.print("[" +num+ "]");
        }
        
        System.out.println();
        System.out.print("VETOR RESULTANTE: ");
        for (int num: vetC){
            System.out.print("[" +num+ "]");
        }
        System.out.println();
    }
}
