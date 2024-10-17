package com.example.bibiliotecaoracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
