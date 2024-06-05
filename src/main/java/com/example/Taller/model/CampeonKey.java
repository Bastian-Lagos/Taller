package com.example.Taller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class CampeonKey {
    @Column(name = "id_campeon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campeonId;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter", nullable = false)
    private Long counterId;
}
