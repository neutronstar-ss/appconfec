package com.appconfec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appconfec.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
