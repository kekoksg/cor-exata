package com.kelvin.corexata.repository;

import com.kelvin.corexata.model.EstoqueTinta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueTintaRepository extends JpaRepository<EstoqueTinta, Long> {
}
