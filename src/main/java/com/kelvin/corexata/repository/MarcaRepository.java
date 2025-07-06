package com.kelvin.corexata.repository;

import com.kelvin.corexata.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
    Marca findByNomeContainingIgnoreCase(String nome);

    Optional<Marca> findByNomeIgnoreCase(String nome);
}
