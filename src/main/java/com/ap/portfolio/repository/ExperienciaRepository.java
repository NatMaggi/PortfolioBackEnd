/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    void deleteExperienciaById(Long id);
    
    Experiencia findExperienciaById(Long id);
}