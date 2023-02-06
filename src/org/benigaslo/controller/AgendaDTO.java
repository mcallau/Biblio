package org.benigaslo.controller;

// Data Transfer Object
public class AgendaDTO {
    public String nombre;
    public String descripcion;

    public AgendaDTO(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
