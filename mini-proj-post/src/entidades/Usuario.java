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
public class Usuario {
    private String nome;
    private String username;
    private String senha;
    private LocalDate aniversario;

    public Usuario(String nome, String username, String senha, LocalDate aniversario) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.aniversario = aniversario;
    }
    
    public Usuario(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("PERFIL DO USUARIO: ");
        sb.append("\nNOME: ").append(nome);
        sb.append("\nUSERNAME: ").append(username);
        sb.append("\nDATA DE NASCIMENTO: ").append(aniversario.format(fmt));
        return sb.toString();
    }
}
