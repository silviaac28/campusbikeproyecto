package com.campusbike.campusbike.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bicicletas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
    private Double precio;

    @Column(columnDefinition = "INT", nullable = false)
    private Long stock;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marcas;

    public Bicicletas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarcas() {
        return marcas;
    }

    public void setMarcas(Marca marcas) {
        this.marcas = marcas;
    }

    











}
