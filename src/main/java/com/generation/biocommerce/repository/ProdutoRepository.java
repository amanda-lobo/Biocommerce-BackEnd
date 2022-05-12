package com.generation.biocommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.biocommerce.model.Categoria;
import com.generation.biocommerce.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);
}
