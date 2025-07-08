package com.kelvin.corexata.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class EstoqueTinta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cor_id")
    private Cor cor;

    private Boolean temPronta;

    public EstoqueTinta() {}

    public EstoqueTinta(Cor cor, Boolean temPronta) {
        this.cor = cor;
        this.temPronta = temPronta;
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

    public Boolean getTemPronta() {
        return temPronta;
    }

    public void setTemPronta(Boolean temPronta) {
        this.temPronta = temPronta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstoqueTinta that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EstoqueTinta{" +
                "id=" + id +
                ", cor=" + cor +
                ", temPronta=" + temPronta +
                '}';
    }
}
