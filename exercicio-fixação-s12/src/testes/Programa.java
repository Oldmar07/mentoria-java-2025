/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import entiades.enuns.OrderStatus;
import entidades.Cliente;
import entidades.ItemDePedido;
import entidades.Pedido;
import entidades.Produto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author oldma
 */
public class Programa {
    public void testePrograma(){
        Scanner sc = new Scanner(System.in);
        Pedido p = new Pedido();
        Cliente c = new Cliente();
        int n;
        
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        
        System.out.println("----------------- REGISTRAR PEDIDO ------------------");
        System.out.println();
        System.out.println("DADOS DO CLIENTE: ");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("EMAIL: ");
        String email = sc.nextLine();
        System.out.print("DATA DE NASCIMENTO: ");
        String dataNasc = sc.nextLine();
        
        LocalDate data = LocalDate.parse(dataNasc, formato2);
        
        c = new Cliente(nome, email, data);
        
        System.out.println();
        System.out.println("DADOS DO PEDIDO: ");
        LocalDateTime agora = LocalDateTime.now();
        String agoraTxt = agora.format(formato1);
        LocalDateTime momento = LocalDateTime.parse(agoraTxt, formato1);
        System.out.print("STATUS DO PEDIDO: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        
        p = new Pedido(momento, status, c);
        
        System.out.println();
        System.out.print("QUANTOS PEDIDOS DESEJA FAZER? ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Digite os dados do " +(i+1)+ "o pedido: ");
            System.out.print("NOME DO PRODUTO: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("PRECO: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("QUANTIDADE: ");
            int quantidade = sc.nextInt();
            
            Produto pd = new Produto(nomeProduto, precoProduto);
            ItemDePedido ip = new ItemDePedido(quantidade, precoProduto, pd);
            p.addItem(ip);
        }
        
        System.out.println();
        System.out.println(p);
        
    }
}
