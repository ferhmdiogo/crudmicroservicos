package com.diogofernando.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diogofernando.crud.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
