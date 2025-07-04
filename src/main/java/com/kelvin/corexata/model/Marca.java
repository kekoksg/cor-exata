package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
}
