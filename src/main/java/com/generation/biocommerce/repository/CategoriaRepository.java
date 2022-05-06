package com.generation.biocommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.biocommerce.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao")String descricao);
}
