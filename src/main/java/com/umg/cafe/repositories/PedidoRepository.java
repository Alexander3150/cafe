package com.umg.cafe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umg.cafe.entities.Pedido;

public interface PedidoRepository   extends JpaRepository<Pedido, Long> {

}