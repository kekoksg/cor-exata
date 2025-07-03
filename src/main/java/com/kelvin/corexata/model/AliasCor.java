package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AliasCor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cor_id", nullable = false)
    private Cor cor;

    private String alias;
}
