package com.kelvin.corexata.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    public Modelo() {}

    public Modelo(String name, Marca marca) {
        this.name = name;
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modelo modelo)) return false;
        return Objects.equals(getId(), modelo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marca=" + marca +
                '}';
    }
}
