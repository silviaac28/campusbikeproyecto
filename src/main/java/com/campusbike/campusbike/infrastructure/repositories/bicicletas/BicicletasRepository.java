package com.campusbike.campusbike.infrastructure.repositories.bicicletas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.domain.entities.Bicicletas;

public interface BicicletasRepository extends JpaRepository<Bicicletas, Long> {

    void removeById(Long id);




}
