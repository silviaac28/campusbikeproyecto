package com.campusbike.campusbike.infrastructure.repositories.ventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.application.services.ventas.VentasService;

import com.campusbike.campusbike.domain.entities.Ventas;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class VentasAdapter implements VentasService {

    @Autowired
    private VentasRepository ventasRepository;

    @Override
    public Ventas save(Ventas ventas){
        return ventasRepository.save(ventas);
    }


    @Override
    @Transactional
    public void remove(Long id){
        ventasRepository.removeById(id);
    }

    @Override
    public Page<Ventas> findAll(Pageable pageable){
        return ventasRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Ventas update(Ventas ventas){
        if(ventasRepository.existsById(ventas.getId())){
            return ventasRepository.save(ventas);
        }
        else{
            throw new EntityNotFoundException("Venta no encontrada");
            
        }
    }




}
