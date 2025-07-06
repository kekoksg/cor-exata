package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nome;
}
