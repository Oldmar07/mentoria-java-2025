/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author oldma
 */
public class Programa {
    public void teste(){
        String caminho = "C:\\Users\\oldma\\Documents\\mentoria-java-2025\\exercicio-s15\\in.csv";
        File pastaSaida = new File("out");
        if (!pastaSaida.exists()){
            boolean criada = pastaSaida.mkdir();
            if (criada){
                System.out.println("Pasta criada!");
            }
            else{
                System.out.println("Erro ao criar pasta");
                return;
            }
        }
        
        String caminho2 = "C:\\Users\\oldma\\Documents\\mentoria-java-2025\\exercicio-s15\\out\\summary.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
            String linha = br.readLine();
            int contador = 0;
            
            while ((linha = br.readLine()) != null && contador < 3){
                String nome = linha.split(",")[0];
                double preco = Double.parseDouble(linha.split(",")[1]);
                int quantidade = Integer.parseInt(linha.split(",")[2]);
                
                double precoTotal = preco * quantidade;
                
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho2,true))){
                    bw.write(nome+ ","+precoTotal);
                    bw.newLine();
                }
                
                contador++;
            }
            System.out.println("Dados guardados em " +caminho2);
        }
        catch (IOException e){
            System.out.println("[ERRO] Erro ao ler o ficheiro.");
        }
    }
}
