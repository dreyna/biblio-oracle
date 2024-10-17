package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Long>{

}
