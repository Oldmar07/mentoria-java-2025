/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author oldma
 */
public class Comentario {
    private String descricao;
    private LocalDateTime momento;

    public Comentario(String descricao, LocalDateTime momento) {
        this.descricao = descricao;
        this.momento = momento;
    }
    
    public Comentario(){
        
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

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm");
        return descricao + " - " + momento.format(fmt);
    }
}
