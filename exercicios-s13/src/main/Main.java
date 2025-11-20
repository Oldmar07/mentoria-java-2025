/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import testes.Programa1;

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
        do{
            System.out.println("QUAL PRORAMA QUER EXECUTAR?");
            System.out.println("1- PROGRAMA 1");
            System.out.println("2- PROGRAMA 2");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            
            switch(op){
                case 1 -> {
                    Programa1 p = new Programa1();
                    p.teste();
                    break;
                }
            }
        }while(op != 0);
    }
    
}
