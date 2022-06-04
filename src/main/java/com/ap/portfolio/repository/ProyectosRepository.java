/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ap.portfolio.repository;


import com.ap.portfolio.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nnmag
 */
public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    void deleteProyectosById(Long id);
    
    Proyectos findProyectosById(Long id);
}
