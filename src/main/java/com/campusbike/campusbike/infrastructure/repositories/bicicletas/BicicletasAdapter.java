package com.campusbike.campusbike.infrastructure.repositories.bicicletas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.campusbike.campusbike.application.services.bicicletas.BicicletasService;
import com.campusbike.campusbike.domain.entities.Bicicletas;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;



@Service
public class BicicletasAdapter implements BicicletasService {
     
    @Autowired
    private BicicletasRepository bicicletasRepository;

    @Override
    public Bicicletas save(Bicicletas bicicletas){
        return bicicletasRepository.save(bicicletas);
    }


    @Override
    @Transactional
    public void remove(Long id){
        bicicletasRepository.removeById(id);
    }

    @Override
    public Page<Bicicletas> findAll(Pageable pageable){
        return bicicletasRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Bicicletas update(Bicicletas bicicletas){
        if(bicicletasRepository.existsById(bicicletas.getId())){
            return bicicletasRepository.save(bicicletas);
        }
        else{
            throw new EntityNotFoundException("Bicicleta no encontrada");
            
        }
    }



}
