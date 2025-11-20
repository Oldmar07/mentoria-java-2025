/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Programa1 {

    public void teste() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int n;

        System.out.print("Quantos produtos deseja ler? ");
        n = sc.nextInt();

        char tipo;
        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" + (i + 1) + " :");
            do {
                System.out.print("Produto comum(c), usado(u) ou importado(i)? ");
                tipo = sc.next().charAt(0);

                if (tipo == 'c' || tipo == 'C') {
                    sc.nextLine();
                    System.out.println("----- PRODUTO COMUM -----");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preco: ");
                    double preco = sc.nextDouble();

                    produtos.add(new Produto(nome, preco));
                } else if (tipo == 'u' || tipo == 'U') {
                    sc.nextLine();
                    System.out.println("----- PRODUTO USADO -----");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preco: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Data de Fabricacao: ");
                    String data = sc.nextLine();
                    
                    LocalDate dataF = LocalDate.parse(data, fmt);

                    produtos.add(new ProdutoUsado(dataF, nome, preco));
                } else if (tipo == 'i' || tipo == 'I') {
                    sc.nextLine();
                    System.out.println("----- PRODUTO IMPORTADO -----");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preco: ");
                    double preco = sc.nextDouble();
                    System.out.print("Taxa de Alfandega: ");
                    double alfandega = sc.nextDouble();

                    produtos.add(new ProdutoImportado(alfandega, nome, preco));
                } else {
                    System.out.println("Tipo Invalido! Digite c-comum, u-usado ou i-importado");
                }

            } while (tipo != 'c' && tipo != 'C' && tipo != 'u' && tipo != 'U' && tipo != 'i' && tipo != 'I');
        }
        
        System.out.println();
        System.out.println("PRODUTOS: ");
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
        System.out.println();
    }
}
