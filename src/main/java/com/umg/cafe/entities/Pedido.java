package com.umg.cafe.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity @Table(name = "pedidos")
@Data @NoArgsConstructor @AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long id;

    @Column(name = "fecha_pedido", nullable = false)
    private java.time.LocalDateTime fechaPedido = java.time.LocalDateTime.now();

    @Column(nullable = false, length = 30)
    private String estado;

    @Column(name = "numero_orden", nullable = false, unique = true, length = 50)
    private String numeroOrden;

    // ----- Relaciones -----
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private java.util.List<DetallePedido> detalles = new java.util.ArrayList<>();
}