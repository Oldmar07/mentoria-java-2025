/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author oldma
 */
public class ProdutoUsado extends Produto {
    private LocalDate dataFabricacao;

    public ProdutoUsado(LocalDate dataFabricacao, String nome, double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    
    public ProdutoUsado(){
        
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String etiquetaPreco(){
        DateTimeFormatter  fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "(Usado) " +preco+ " Kz. (Data de Fabricacao: " +dataFabricacao.format(fmt)+ ")";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" ").append(etiquetaPreco());
        return sb.toString();
    }
}
