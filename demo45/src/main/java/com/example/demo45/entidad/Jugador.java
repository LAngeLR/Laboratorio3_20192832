package com.example.demo45.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "jugador")
@Getter
@Setter
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idjugador;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    private Integer edad;

    @Column(name = "posicion",nullable = false,length = 45)
    private String posicion;

    @Column(name = "club",nullable = false,length = 45)
    private String club;

    private Integer sn_idseleccion;
}
