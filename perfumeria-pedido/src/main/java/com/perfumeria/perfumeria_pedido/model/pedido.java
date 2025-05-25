package com.perfumeria.perfumeria_pedido.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Long idCliente;
    private LocalDateTime fechaPedido;
    private int totalPedido;


    @Enumerated(EnumType.STRING)
    private EstadoPedido estado; // Estado del pedido.

    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductoPedido> productos; // Lista de productos incluidos



    public Long getIdPedido() {
        return idPedido;
    }
    public Long getIdCliente() {
        return idCliente;
    }
    public LocalDateTime getFechaPedido() {
        return fechaPedido;
    }
    public int getTotalPedido() {
        return totalPedido;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public List<ProductoPedido> getProductos() {
        return productos;
    }



    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    public void setFechaPedido(LocalDateTime fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    public void setTotalPedido(int totalPedido) {
        this.totalPedido = totalPedido;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    public void setProductos(List<ProductoPedido> productos) {
        this.productos = productos;
    }
}
