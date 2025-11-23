/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import entidades.Companhia;
import entidades.Contribuente;
import entidades.Individual;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Programa2 {

    public void teste() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contribuente> contribuintes = new ArrayList<>();
        int n;
        char tipo;

        System.out.print("\nQuantos contribuintes deseja cadastrar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Dados do contribuinte #" + (i + 1));

            do {
                System.out.print("(i)Individual ou (c)Companhia? ");
                tipo = sc.next().charAt(0);

                if (tipo == 'i' || tipo == 'I') {
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Renda Anual: ");
                    double rendaAnual = sc.nextDouble();
                    System.out.print("Gasto com saude: ");
                    double gastoSaude = sc.nextDouble();

                    contribuintes.add(new Individual(gastoSaude, nome, rendaAnual));
                } else if (tipo == 'c' || tipo == 'C') {
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Renda Anual: ");
                    double rendaAnual = sc.nextDouble();
                    System.out.print("Numero de Funcionarios: ");
                    int numFuncionarios = sc.nextInt();

                    contribuintes.add(new Companhia(numFuncionarios, nome, rendaAnual));
                } else {
                    System.out.println("\nTipo Invalido! Digite (i) ou (c)");
                }
            } while (tipo != 'i' && tipo != 'I' && tipo != 'c' && tipo != 'C');
        }

        System.out.println("\nIMPOSTOS PAGOS: ");
        double impostoTotal = 0.0;
        for (Contribuente c : contribuintes) {
            System.out.println(c.toString());
            impostoTotal += c.calcularImposto();
        }
        System.out.println("---------------------------------------");
        System.out.printf("IMPOSTO TOTAL: %.2f Kz.", impostoTotal);
        System.out.println();
        System.out.println();
    }
}
