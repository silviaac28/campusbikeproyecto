package com.campusbike.campusbike.infrastructure.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.campusbike.campusbike.application.services.bicicletas.BicicletasService;
import com.campusbike.campusbike.domain.entities.Bicicletas;

import jakarta.validation.Valid;




@RestController
@RequestMapping("/bicicletasapi")
public class BicicletasController {

    @Autowired 
    private BicicletasService bicicletasService;

    @PostMapping
    private ResponseEntity<Bicicletas> creaEntity(@Valid @RequestBody Bicicletas bicicletas){
        Bicicletas newbicicleta = bicicletasService.save(bicicletas);
        return ResponseEntity.status(HttpStatus.CREATED).body(newbicicleta);
    }



@DeleteMapping
public ResponseEntity<String> deleteBicicleta(@RequestParam Long id){
    bicicletasService.remove(id);
    return new ResponseEntity<>("Bicicleta eliminada", HttpStatus.OK);
}




@GetMapping("/allbicicletas")
public ResponseEntity<Page<Bicicletas>> findAll(Pageable pageable){
    Page<Bicicletas> BicicletasPage = bicicletasService.findAll(pageable);

    if (BicicletasPage.hasContent()){
        return ResponseEntity.ok(BicicletasPage);
    }

    
        return ResponseEntity.notFound().build();

    }


@PutMapping
public ResponseEntity<Bicicletas> updateBicicleta(@Valid @RequestBody Bicicletas bicicletas){
    Bicicletas bicicletaUpdated = bicicletasService.update(bicicletas);
    return ResponseEntity.ok(bicicletaUpdated);
}



}


