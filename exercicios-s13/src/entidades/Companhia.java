/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public class Companhia extends Contribuente {

    private int numFuncionarios;

    public Companhia(int numFuncionarios, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Companhia() {

    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
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
    public double getRendaAnual() {
        return rendaAnual;
    }

    @Override
    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public double calcularImposto() {
        double imposto = 0.0;
        if (numFuncionarios >= 10) {
            imposto = 0.14;
        } 
        else {
            imposto = 0.16;
        }
        return (rendaAnual * imposto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(": ").append(String.format("%.2f", calcularImposto())).append(" Kz.");
        return sb.toString();
    }

}
