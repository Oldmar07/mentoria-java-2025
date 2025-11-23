/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public abstract class Contribuente {
    protected String nome;
    protected double rendaAnual;

    public Contribuente(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    
    public Contribuente(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    public abstract double calcularImposto();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contribuentes{");
        sb.append("nome=").append(nome);
        sb.append(", rendaAnual=").append(rendaAnual);
        sb.append('}');
        return sb.toString();
    }
}
