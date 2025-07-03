package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AnoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    private int ano;
}
