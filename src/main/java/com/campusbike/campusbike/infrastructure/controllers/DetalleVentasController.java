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

import com.campusbike.campusbike.application.services.detalleventas.DetalleVentasService;
import com.campusbike.campusbike.domain.entities.DetalleVentas;


import jakarta.validation.Valid;

@RestController
@RequestMapping("/detalleventasapi")
public class DetalleVentasController {

    @Autowired 
    private DetalleVentasService detalleVentasService;

    @PostMapping
    private ResponseEntity<DetalleVentas> creaEntity(@Valid @RequestBody DetalleVentas detalleVentas){
        DetalleVentas newbicicleta = detalleVentasService.save(detalleVentas);
        return ResponseEntity.status(HttpStatus.CREATED).body(newbicicleta);
    }



@DeleteMapping
public ResponseEntity<String> deleteDetalleVenta(@RequestParam Long id){
    detalleVentasService.remove(id);
    return new ResponseEntity<>("Detalle venta eliminado", HttpStatus.OK);
}




@GetMapping("/alldetalleventas")
public ResponseEntity<Page<DetalleVentas>> findAll(Pageable pageable){
    Page<DetalleVentas> DetalleVentasPage = detalleVentasService.findAll(pageable);

    if (DetalleVentasPage.hasContent()){
        return ResponseEntity.ok(DetalleVentasPage);
    }

    
        return ResponseEntity.notFound().build();

    }


@PutMapping
public ResponseEntity<DetalleVentas> updateDetalleVenta(@Valid @RequestBody DetalleVentas detalleVentas){
    DetalleVentas detalleVentasUpdated = detalleVentasService.update(detalleVentas);
    return ResponseEntity.ok(detalleVentasUpdated);
}






}
