package com.campusbike.campusbike.application.services.ventas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.campusbike.campusbike.domain.entities.Ventas;

public interface VentasService {

    Ventas save(Ventas ventas);

    void remove(Long id);

    Page<Ventas> findAll(Pageable pageable);

    Ventas update(Ventas ventas);


}
