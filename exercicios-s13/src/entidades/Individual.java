/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author oldma
 */
public class Individual extends Contribuente {

    private double gastoSaude;

    public Individual(double gastoSaude, String nome, double rendaAnual) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Individual() {

    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
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
        if (rendaAnual < 20000) {
            imposto = 0.15;
        } 
        else if (rendaAnual >= 20000) {
            imposto = 0.25;
        }
        
        if(gastoSaude > rendaAnual){
            gastoSaude = 0;
        }
        return (rendaAnual * imposto) - (gastoSaude * 0.5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(": ").append(String.format("%.2f", calcularImposto())).append(" Kz.");
        return sb.toString();
    }
}
