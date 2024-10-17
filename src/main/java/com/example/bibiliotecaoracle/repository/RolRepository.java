package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
