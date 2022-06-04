/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author nnmag
 */
public class HabilidadesDto {
    private String habilidad;
    private String url_img;
    
    public HabilidadesDto(){
    }

    public HabilidadesDto(String habilidad, String url_img) {
        this.habilidad = habilidad;
        this.url_img = url_img;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
    
    
    
}
