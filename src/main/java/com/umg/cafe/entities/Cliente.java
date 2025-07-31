package com.umg.cafe.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity @Table(name = "clientes")
@Data @NoArgsConstructor @AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(nullable = false, length = 120)
    private String nombre;

    @Column(name = "correo_electronico", nullable = false, unique = true, length = 150)
    private String correoElectronico;

    @Column(name = "direccion_envio", nullable = false, columnDefinition = "text")
    private String direccionEnvio;
}