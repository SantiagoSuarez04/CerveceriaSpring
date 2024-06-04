package com.celvesa.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celvesa.app.domain.Cerveceria;

public interface CerveceriaRepository extends JpaRepository<Cerveceria, Long>{
    List<Cerveceria> findByNombre_cerveceria(String nombre_cerveceria);
    List<Cerveceria> findByMarca_cerveza(String marca_cerveza);
}
