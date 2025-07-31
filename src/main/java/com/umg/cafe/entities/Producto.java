package com.umg.cafe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity @Table(name = "producto")
@Data @NoArgsConstructor @AllArgsConstructor
public class Producto {

    @Id
    @Column(length = 50)
    private String sku;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(name = "precio_actual", nullable = false, precision = 10, scale = 2)
    private Double precioActual;

    @Column(nullable = false)
    private Integer stock;

    // ----- Relaciones -----
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipocafe", nullable = false)
    private TipoCafe tipoCafe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
}