package com.example.bibiliotecaoracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
