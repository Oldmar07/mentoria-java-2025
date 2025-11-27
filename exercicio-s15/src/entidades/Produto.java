/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;    

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public Produto(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("nome=").append(nome);
        sb.append(", preco=").append(preco);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
}
