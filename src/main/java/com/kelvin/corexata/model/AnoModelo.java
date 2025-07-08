package com.kelvin.corexata.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class AnoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id", nullable = false)
    private Modelo modelo;

    private int ano;

    public AnoModelo() {}

    public AnoModelo(Modelo modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnoModelo anoModelo)) return false;
        return Objects.equals(getId(), anoModelo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AnoModelo{" +
                "id=" + id +
                ", modelo=" + modelo +
                ", ano=" + ano +
                '}';
    }
}
