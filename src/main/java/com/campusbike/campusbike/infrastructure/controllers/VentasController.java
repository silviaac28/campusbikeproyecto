package com.campusbike.campusbike.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

import com.campusbike.campusbike.application.services.ventas.VentasService;
import com.campusbike.campusbike.domain.entities.Ventas;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/ventasapi")

public class VentasController {

        @Autowired 
    private VentasService ventasService;

    @PostMapping
    private ResponseEntity<Ventas> creaEntity(@Valid @RequestBody Ventas ventas){
        Ventas newventa = ventasService.save(ventas);
        return ResponseEntity.status(HttpStatus.CREATED).body(newventa);
    }


@DeleteMapping
public ResponseEntity<String> deleteVenta(@RequestParam Long id){
    ventasService.remove(id);
    return new ResponseEntity<>("Venta eliminada", HttpStatus.OK);
}




@GetMapping("/allventas")
public ResponseEntity<Page<Ventas>> findAll(Pageable pageable){
    Page<Ventas> ventasPage = ventasService.findAll(pageable);

    if (ventasPage.hasContent()){
        return ResponseEntity.ok(ventasPage);
    }

    
        return ResponseEntity.notFound().build();

    }


@PutMapping
public ResponseEntity<Ventas> updateVenta(@Valid @RequestBody Ventas ventas){
    Ventas ventaUpdated = ventasService.update(ventas);
    return ResponseEntity.ok(ventaUpdated);
}


}
