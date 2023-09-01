package com.example.demo45.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo45.entidad.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
}
