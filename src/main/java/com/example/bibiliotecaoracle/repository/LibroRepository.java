package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

}
