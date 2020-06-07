package com.appconfec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appconfec.models.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}
