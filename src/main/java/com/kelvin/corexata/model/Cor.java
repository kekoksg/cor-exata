package com.kelvin.corexata.model;

import com.kelvin.corexata.model.Enum.CategoriaTipoBase;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Cor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeComercial;

    private String codigoInterno;

    @Enumerated(EnumType.STRING)
    private CategoriaTipoBase tipoBase;

}
