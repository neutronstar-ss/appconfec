package com.appconfec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appconfec.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
