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

public class Habilidades implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 

    private Long id;
    private String habilidad;
    private String url_img;
    
    public Habilidades(){
        
    }

    public Habilidades(Long id, String habilidad, String url_img) {
        this.id = id;
        this.habilidad = habilidad;
        this.url_img = url_img;
  
    }
    
    @Override
    public String toString(){
        return "Habilidades{" +
                "id=" + id +
                ",habilidad=" + habilidad + '\'' +
                ", logo=" + url_img +  '\'' +
                '}';

    }    
}
