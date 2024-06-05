package com.example.Taller.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Interaccion {
    @Id
    @Column(name = "id_interaccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "limite_interaccion", nullable = false)
    private Long limiteInteraccion;

    @ManyToMany
    @JoinTable(
        name = "campeon_has_interaccion",
        joinColumns = @JoinColumn(name="interaccion_id_interaccion"),
        inverseJoinColumns = @JoinColumn(name="campeon_id_campeon")
    )
    private List<Campeon> interacciones = new ArrayList<>(); 
}
