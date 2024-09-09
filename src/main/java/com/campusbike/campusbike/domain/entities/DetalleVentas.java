package com.campusbike.campusbike.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetalleVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "INT", nullable = false)
    private Long cantidad;

    @Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
    private Double precio_unitario;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    private Ventas ventas;


    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    private Bicicletas bicicletas;


    public DetalleVentas() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getCantidad() {
        return cantidad;
    }


    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }


    public Double getPrecio_unitario() {
        return precio_unitario;
    }


    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }


    public Ventas getVentas() {
        return ventas;
    }


    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }


    public Bicicletas getBicicletas() {
        return bicicletas;
    }


    public void setBicicletas(Bicicletas bicicletas) {
        this.bicicletas = bicicletas;
    }

    







}
