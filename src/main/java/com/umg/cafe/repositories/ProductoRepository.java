package com.umg.cafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.cafe.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String> {
    
}