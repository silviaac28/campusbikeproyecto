package com.campusbike.campusbike.infrastructure.repositories.ventas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.domain.entities.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Long> {

    void removeById(Long id);
    
}
