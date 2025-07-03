package com.kelvin.corexata.repository;

import com.kelvin.corexata.model.AnoModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnoModeloRepository extends JpaRepository<AnoModelo, Long> {
}
