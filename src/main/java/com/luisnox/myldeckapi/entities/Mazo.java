package com.luisnox.myldeckapi.entities;

import java.util.List;

public class Mazo {
    private Long id;
    private String nombre;
    private String edicion;
    private String raza;
    private List<Carta> cartas;
    private Usuario usuario;
}
