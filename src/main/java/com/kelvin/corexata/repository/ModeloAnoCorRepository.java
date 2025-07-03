package com.kelvin.corexata.repository;

import com.kelvin.corexata.model.ModeloAnoCor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloAnoCorRepository extends JpaRepository<ModeloAnoCor, Long> {
}
