package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{

}
