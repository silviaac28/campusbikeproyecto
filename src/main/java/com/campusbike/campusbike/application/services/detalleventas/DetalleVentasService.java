package com.campusbike.campusbike.application.services.detalleventas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.campusbike.campusbike.domain.entities.DetalleVentas;



public interface DetalleVentasService {

    DetalleVentas save(DetalleVentas detalleVentas);

    void remove(Long id);

    Page<DetalleVentas> findAll(Pageable pageable);

    DetalleVentas update(DetalleVentas detalleVentas);

}
