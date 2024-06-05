package com.example.Taller.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre",nullable=false)
    private String nombre;

    @Column(name="pocentaje_victoria", nullable = false)
    private Float porcentajeVictoria;

    @Column(name="pocentaje_derrota", nullable = false)
    private Float porcentajeDerrota;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", unique = true, nullable = false)
    private Nacionalidad Nacionalidad;

    @OneToOne
    @JoinColumn(name = "especie_id_especie",unique = true, nullable = false)
    private Especie especie;

    @OneToMany(mappedBy = "counter",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Campeon> campeones;
}
