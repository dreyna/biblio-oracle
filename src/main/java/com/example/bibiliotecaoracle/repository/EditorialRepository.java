package com.example.bibiliotecaoracle.repository;

import com.example.bibiliotecaoracle.entity.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long>{

}
