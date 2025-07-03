package com.kelvin.corexata.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EstoqueTinta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cor_id")
    private Cor cor;

    private Boolean temPronta;
}
