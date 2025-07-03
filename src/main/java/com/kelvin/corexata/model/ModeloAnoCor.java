package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ModeloAnoCor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "ano_modelo_id", nullable = false)
    private AnoModelo anoModelo;

    @ManyToOne
    @JoinColumn(name = "cor_id", nullable = false)
    private Cor cor;
}
