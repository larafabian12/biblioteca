package com.lara.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lara.biblioteca.entity.AutorEntity;

public interface AutorRepository extends JpaRepository<AutorEntity, Integer>{
    
}
