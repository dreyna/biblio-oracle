package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LectorRepository extends JpaRepository<Lector, Long>{

}
