package com.umg.cafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.cafe.entities.DetallePedido;

public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {

}