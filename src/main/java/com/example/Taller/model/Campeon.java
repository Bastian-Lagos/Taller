package com.example.Taller.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Campeon {
    @Id
    @Column(name = "id_campeon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_ataque", nullable = false)
    private String tipoAtaque;

    @Column(name = "vida_base", nullable = false)
    private Long vidaBase;

    @Column(name = "mana_bool", nullable = false)
    private Integer manaBool;

    @Column(name = "energia_bool", nullable = false)
    private Integer energiaBool;

    @Column(name = "velocidad_ataque_base", nullable = false)
    private Float velocidadAtaque;

    @Column(name = "velocidad_movimiento_base", nullable = false)
    private Float velocidadMovimiento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "nacionalidad_id_nacionalidad", unique = true, nullable = false)
    private Nacionalidad Nacionalidad;

    @OneToOne
    @JoinColumn(name = "especie_id_especie",unique = true, nullable = false)
    private Especie especie;

    @ManyToOne
    @JoinColumn(name = "counter_id_counter")
    private Counter counter;

    @ManyToOne
    @JoinColumn(name = "rival_id_rival")
    private Rival rival;

    @ManyToMany(mappedBy = "campeon_id_campeon")
    private List<Interaccion> interacciones;

}
