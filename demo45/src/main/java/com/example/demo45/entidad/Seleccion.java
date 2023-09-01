package com.example.demo45.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "seleccion")
@Getter
@Setter
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idseleccion;

    @Column(name = "nombre",nullable = false,length = 45)
    private String nombre;

    @Column(name = "tecnico",nullable = false,length = 45)
    private String tecnico;

    private Integer estadios_idestadios;
}
