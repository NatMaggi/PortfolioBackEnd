
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
@Getter 
@Setter
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String institucion;
    private String fechaFin;
    private String titulo;
    
   public Educacion(){
       
   }

    public Educacion(Long id, String institucion, String fechaFin, String titulo, Persona persona) {
        this.id = id;
        this.institucion = institucion;
        this.fechaFin = fechaFin;
        this.titulo = titulo;
       
    }
    @Override
    public String toString(){
        return "Educacion {" +
                "id=" + id +
                ", institucion=" + institucion + '\'' +
                ", fecha finalizacion=" + fechaFin + '\'' +
                ", titulo=" + titulo + '\'' +
                '}';
    }

}
