/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import exercicios.Ex1;
import exercicios.Ex10;
import exercicios.Ex11;
import exercicios.Ex2;
import exercicios.Ex3;
import exercicios.Ex4;
import exercicios.Ex5;
import exercicios.Ex6;
import exercicios.Ex7;
import exercicios.Ex8;
import exercicios.Ex9;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("----- MENU DE EXERCICIOS -----");
            System.out.println("1 - EXERCICIO 1");
            System.out.println("2 - EXERCICIO 2");
            System.out.println("3 - EXERCICIO 3");
            System.out.println("4 - EXERCICIO 4");
            System.out.println("5 - EXERCICIO 5");
            System.out.println("6 - EXERCICIO 6");
            System.out.println("7 - EXERCICIO 7");
            System.out.println("8 - EXERCICIO 8");
            System.out.println("9 - EXERCICIO 9");
            System.out.println("10 - EXERCICIO 10");
            System.out.println("11 - EXERCICIO 11");
            System.out.println("0 - SAIR");
            System.out.print("ESCOLHA O EXERCICIO: ");
            op = sc.nextInt();
            System.out.println();
            System.out.println();

            switch (op) {
                case 1 -> {
                    System.out.println("----- EXERCICIO 1 -----");
                    Ex1 e = new Ex1();
                    e.ex1();
                    System.out.println();
                    break;
                }
                case 2 -> {
                    System.out.println("----- EXERCICIO 2 -----");
                    Ex2 e = new Ex2();
                    e.ex2();
                    System.out.println();
                    break;
                }
                case 3 -> {
                    System.out.println("----- EXERCICIO 3 -----");
                    Ex3 e = new Ex3();
                    e.ex3();
                    System.out.println();
                    break;
                }
                case 4 -> {
                    System.out.println("----- EXERCICIO 4 -----");
                    Ex4 e = new Ex4();
                    e.ex4();
                    System.out.println();
                    break;
                }
                case 5 -> {
                    System.out.println("----- EXERCICIO 5 -----");
                    Ex5 e = new Ex5();
                    e.ex5();
                    System.out.println();
                    break;
                }
                case 6 -> {
                    System.out.println("----- EXERCICIO 6 -----");
                    Ex6 e = new Ex6();
                    e.ex6();
                    System.out.println();
                    break;
                }
                case 7 -> {
                    System.out.println("----- EXERCICIO 7 -----");
                    Ex7 e = new Ex7();
                    e.ex7();
                    System.out.println();
                    break;
                }
                case 8 -> {
                    System.out.println("----- EXERCICIO 8 -----");
                    Ex8 e = new Ex8();
                    e.ex8();
                    System.out.println();
                    break;
                }
                case 9 -> {
                    System.out.println("----- EXERCICIO 9 -----");
                    Ex9 e = new Ex9();
                    e.ex9();
                    System.out.println();
                    break;
                }
                case 10 -> {
                    System.out.println("----- EXERCICIO 10 -----");
                    Ex10 e = new Ex10();
                    e.ex10();
                    System.out.println();
                    break;
                }
                case 11 -> {
                    System.out.println("----- EXERCICIO 11 -----");
                    Ex11 e = new Ex11();
                    e.ex11();
                    System.out.println();
                    break;
                }
                case 0 -> {
                    System.out.println("SAINDO...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("OPCAO INVALIDA!!!");
                    break;
                }
            }
        } while (op != 0);
    }
}
