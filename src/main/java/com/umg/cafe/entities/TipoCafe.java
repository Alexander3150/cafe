package com.umg.cafe.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity @Table(name = "tipo_cafe")
@Data @NoArgsConstructor @AllArgsConstructor
public class TipoCafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipocafe")
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String nombre;
}