package com.example.prototipo1.eventosprototipo1;

import android.graphics.Bitmap;

public class EventoClass {
    private String id;
    private String nombre;
    private String pais;
    private String ciudad;
    private String lugar;
    private String descripcion;
    private String categoria;
    private String capacidad;
    private String imagen;

    public EventoClass(String id, String nombre, String pais, String ciudad, String lugar, String descripcion, String categoria, String capacidad, String imagen) {
        this.id =id;
        this.nombre=nombre;
        this.pais=pais;
        this.ciudad=ciudad;
        this.lugar=lugar;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.capacidad=capacidad;
        this.imagen=imagen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
