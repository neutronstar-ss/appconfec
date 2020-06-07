package com.appconfec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appconfec.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
