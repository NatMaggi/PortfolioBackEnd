package com.ap.portfolio.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String posicion;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String edad, String telefono, String correo, String sobre_mi, String url_foto, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.posicion = posicion;

    }
    
    @Override
    public String toString() {
        return "Persona{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", apellido=" + apellido + '\''
                + ", edad=" + edad + '\''
                + ", telefono=" + telefono + '\''
                + ", correo=" + correo + '\''
                + ", sobre_mi=" + sobre_mi + '\''
                + ", url_foto=" + url_foto + '\''
                + ", posicion=" + posicion + '\''
                + '}';
    }
}

