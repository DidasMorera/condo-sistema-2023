package com.dev.backendCondo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendCondo.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
