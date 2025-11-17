/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public class ItemDePedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemDePedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }
    
    public ItemDePedido(){
        
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public double subTotal(){
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "- " +getProduto().getNome()+ ", " +String.format("%.2f", preco)+ " Kz, Quantidade: " +quantidade+ " SubTotal: " +subTotal()+ " Kz.";
    }
    
}
