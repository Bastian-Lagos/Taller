package com.example.Taller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Rival {
    @Id
    @Column(name = "id_rival")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", unique = true, nullable = false)
    private Nacionalidad Nacionalidad;

    @OneToOne
    @JoinColumn(name = "especie_id_especie",unique = true, nullable = false)
    private Especie especie;
}
