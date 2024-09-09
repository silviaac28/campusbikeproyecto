package com.campusbike.campusbike.infrastructure.repositories.detalleventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.application.services.detalleventas.DetalleVentasService;
import com.campusbike.campusbike.domain.entities.DetalleVentas;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class DetalleVentasAdapter implements DetalleVentasService{

    @Autowired
    private DetalleVentasRepository detalleVentasRepository;

    @Override
    public DetalleVentas save(DetalleVentas detalleVentas){
        return detalleVentasRepository.save(detalleVentas);
    }


    @Override
    @Transactional
    public void remove(Long id){
        detalleVentasRepository.removeById(id);
    }

    @Override
    public Page<DetalleVentas> findAll(Pageable pageable){
        return detalleVentasRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public DetalleVentas update(DetalleVentas detalleVentas){
        if(detalleVentasRepository.existsById(detalleVentas.getId())){
            return detalleVentasRepository.save(detalleVentas);
        }
        else{
            throw new EntityNotFoundException("Detalle venta no encontrado");
            
        }
    }

}
