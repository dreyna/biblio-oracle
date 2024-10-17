package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
