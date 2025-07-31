package com.umg.cafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.cafe.entities.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long> {}