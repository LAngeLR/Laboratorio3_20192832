package com.example.demo45.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo45.entidad.Seleccion;
import org.springframework.stereotype.Repository;

@Repository
public interface SeleccionRepository extends JpaRepository<Seleccion, Integer> {
}
