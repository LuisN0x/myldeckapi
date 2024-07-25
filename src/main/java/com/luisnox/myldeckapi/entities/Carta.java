package com.luisnox.myldeckapi.entities;

@Entity
@Inheritance
public abstract class Carta {
    private Long id;
    private String nombre;
    private String tipo;
    private String edicion;
    private Integer coste;
    private String imagenUrl;
    private Double precio;
}
