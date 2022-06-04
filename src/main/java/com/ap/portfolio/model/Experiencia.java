
package com.ap.portfolio.model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private int id;
    private String nombreEmpresa;
    private String fechaInicio;
    private String fechaFin;
    private String descripcion;
    
    public Experiencia() {
        
    }

    public Experiencia(int id, String nombreEmpresa, String fechaInicio, String fechaFin, String descripcion, Persona persona) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
     
    }

    @Override
    public String toString(){
        return "Experiencia{" +
                "id=" + id +
                ",nombre de empresa=" + nombreEmpresa + '\'' +
                ", fecha de inicio=" + fechaInicio +  '\'' +
                ", fecha de finalizacion=" + fechaFin+  '\'' +
                ", descripcion=" + descripcion +  '\'' +
                '}';

    }    
    
  
}
