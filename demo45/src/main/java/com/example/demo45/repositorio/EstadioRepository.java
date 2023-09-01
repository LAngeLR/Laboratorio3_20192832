package com.example.demo45.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo45.entidad.Estadio;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {
}
