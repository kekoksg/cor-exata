package com.kelvin.corexata.repository;

import com.kelvin.corexata.model.AliasCor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasCorRepository extends JpaRepository<AliasCor, Long> {
}
