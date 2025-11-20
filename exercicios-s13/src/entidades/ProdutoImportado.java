/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public class ProdutoImportado extends Produto {
    private double alfandega;

    public ProdutoImportado(double alfandega, String nome, double preco) {
        super(nome, preco);
        this.alfandega = alfandega;
    }
    
    public ProdutoImportado(){
        
    }

    public double getAlfandega() {
        return alfandega;
    }

    public void setAlfandega(double alfandega) {
        this.alfandega = alfandega;
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
        return preco+ " Kz. (Taxa de Alfandega: " +alfandega+ " Kz.)";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" ").append(etiquetaPreco());
        return sb.toString();
    }
}
