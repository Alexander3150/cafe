package com.umg.cafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.cafe.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}