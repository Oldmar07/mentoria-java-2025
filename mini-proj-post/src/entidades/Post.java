/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.EstadosDeEspirito;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author oldma
 */
public class Post {

    private String titulo;
    private String descricao;
    private EstadosDeEspirito estado;
    private LocalDateTime momento;
    private Usuario usuario;
    private int likes = 0;

    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public Post(String titulo, String descricao, EstadosDeEspirito estado, LocalDateTime momento, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.estado = estado;
        this.momento = momento;
        this.usuario = usuario;
    }

    public Post() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public EstadosDeEspirito getEstado() {
        return estado;
    }

    public void setEstado(EstadosDeEspirito estado) {
        this.estado = estado;
    }

    public void adicionarComentario(Comentario c) {
        comentarios.add(c);
    }

    public void removerComentario(int index) {
        comentarios.remove(index);
        
    }

    public void darLikes() {
        likes += 1;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(titulo).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        sb.append(likes).append(" likes - ");
        sb.append(usuario.getUsername()).append(" aos ").append(momento.format(fmt)).append("\n");
        sb.append(descricao).append("\n");
        sb.append("COMENTARIOS: \n");

        if (comentarios.isEmpty()) {
            System.out.println("Ainda nao ha nenhum comentario.");
        } else {
            for (Comentario c : comentarios) {
                sb.append(c.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
