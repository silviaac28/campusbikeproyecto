package com.campusbike.campusbike.infrastructure.repositories.detalleventas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campusbike.campusbike.domain.entities.DetalleVentas;

public interface DetalleVentasRepository extends JpaRepository<DetalleVentas, Long>{

    void removeById(Long id);

}
