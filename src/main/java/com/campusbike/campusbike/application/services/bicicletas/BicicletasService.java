package com.campusbike.campusbike.application.services.bicicletas;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.campusbike.campusbike.domain.entities.Bicicletas;

public interface BicicletasService  {

    Bicicletas save(Bicicletas bicicletas);

    void remove(Long id);

    Page<Bicicletas> findAll(Pageable pageable);

    Bicicletas update(Bicicletas bicicletas);


}
