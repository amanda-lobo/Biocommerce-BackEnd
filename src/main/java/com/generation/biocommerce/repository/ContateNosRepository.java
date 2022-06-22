package com.generation.biocommerce.repository;


import com.generation.biocommerce.model.ContateNos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContateNosRepository extends JpaRepository<ContateNos, Long> {
}