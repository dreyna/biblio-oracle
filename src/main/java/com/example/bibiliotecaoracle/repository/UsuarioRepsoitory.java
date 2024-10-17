package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface UsuarioRepsoitory extends JpaRepository<Usuario, Long>{
	public Usuario findByUsername(String username);
}
