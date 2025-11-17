/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entiades.enuns.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author oldma
 */
public class Pedido {
    private LocalDateTime momento;
    private OrderStatus status;
    private Cliente cliente;
    
    private ArrayList<ItemDePedido> itens = new ArrayList<>();

    public Pedido(LocalDateTime momento, OrderStatus status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }
    
    public Pedido(){
        
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemDePedido item){
        itens.add(item);
    }
    
    public void removeItem(ItemDePedido item){
        itens.remove(item);
    }
    
    public double total(){
        double total = 0;
        for (ItemDePedido i: itens){
            total += i.subTotal();
        }
        return total;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        StringBuilder  sb = new StringBuilder();
        sb.append("SUMARIO: \n");
        sb.append("Momento do Pedido: ").append(momento.format(fmt)).append("\n");
        sb.append("Status do Pedido: ").append(status).append("\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append("Itens do Pedido: \n");
        
        for (ItemDePedido item: itens){
            sb.append(item.toString()).append("\n");
        }
        
        sb.append("Total: ").append(String.format("%.2f", total())).append(" Kz.\n");
        return sb.toString();
    }
}
