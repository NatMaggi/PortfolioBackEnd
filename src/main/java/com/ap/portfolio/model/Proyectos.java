
package com.ap.portfolio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter

public class Proyectos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
  
    private int id;
    

    private String nombre;
    private String descripcion;
    private String fecha;
    
    public Proyectos(){
        
    }

    public Proyectos(int id, String nombre, String descripcion, String fecha, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;

    }
    
    @Override
    public String toString(){
        return "proyectos{" +
                "id=" + id +
                ",nombre=" + nombre + '\'' +
                ", descripcion=" + descripcion +  '\'' +
                ", fecha=" + fecha +  '\'' +
                '}';

    }       

        
    
}
