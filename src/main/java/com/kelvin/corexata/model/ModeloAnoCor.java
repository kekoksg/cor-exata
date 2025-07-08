package com.kelvin.corexata.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class ModeloAnoCor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "ano_modelo_id", nullable = false)
    private AnoModelo anoModelo;

    @ManyToOne
    @JoinColumn(name = "cor_id", nullable = false)
    private Cor cor;

    public ModeloAnoCor() {}

    public ModeloAnoCor(Modelo modelo, AnoModelo anoModelo, Cor cor) {
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.cor = cor;
    }

    public Long getId() {
        return id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public AnoModelo getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(AnoModelo anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ModeloAnoCor that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ModeloAnoCor{" +
                "id=" + id +
                ", modelo=" + modelo +
                ", anoModelo=" + anoModelo +
                ", cor=" + cor +
                '}';
    }
}
