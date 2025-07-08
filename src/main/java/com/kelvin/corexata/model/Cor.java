package com.kelvin.corexata.model;

import com.kelvin.corexata.model.Enum.CategoriaTipoBase;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeComercial;

    private String codigoInterno;

    @Enumerated(EnumType.STRING)
    private CategoriaTipoBase tipoBase;

    public Cor() {}

    public Cor(String nomeComercial, String codigoInterno, CategoriaTipoBase tipoBase) {
        this.nomeComercial = nomeComercial;
        this.codigoInterno = codigoInterno;
        this.tipoBase = tipoBase;
    }

    public Long getId() {
        return id;
    }

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public CategoriaTipoBase getTipoBase() {
        return tipoBase;
    }

    public void setTipoBase(CategoriaTipoBase tipoBase) {
        this.tipoBase = tipoBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cor cor)) return false;
        return Objects.equals(getId(), cor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Cor{" +
                "id=" + id +
                ", nomeComercial='" + nomeComercial + '\'' +
                ", codigoInterno='" + codigoInterno + '\'' +
                ", tipoBase=" + tipoBase +
                '}';
    }
}
