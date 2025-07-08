package com.kelvin.corexata.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class AliasCor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cor_id", nullable = false)
    private Cor cor;

    private String alias;

    public AliasCor() {}

    public AliasCor(Cor cor, String alias) {
        this.cor = cor;
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AliasCor aliasCor)) return false;
        return Objects.equals(getId(), aliasCor.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AliasCor{" +
                "id=" + id +
                ", cor=" + cor +
                ", alias='" + alias + '\'' +
                '}';
    }
}
