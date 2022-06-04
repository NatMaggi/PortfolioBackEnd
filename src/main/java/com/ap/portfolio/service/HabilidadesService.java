/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.portfolio.service;

import com.ap.portfolio.model.Habilidades;
import com.ap.portfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService {
    private final HabilidadesRepository habRepo;
    
    @Autowired
    public HabilidadesService(HabilidadesRepository habRepo) {
        this.habRepo = habRepo;
    }
    
    public Habilidades addHabilidades(Habilidades habilidades){
        return habRepo.save(habilidades);
    }
    
    public List <Habilidades> findAllHabilidades() {
        return habRepo.findAll();
    }
    
    public Habilidades updateHabilidades(Habilidades habilidades) {
        return habRepo.save(habilidades);
    }   
    
    public Habilidades findHabilidades(Long id){
        return habRepo.findHabilidadesById(id);
    
    }
    public void deleteHabilidades(Long id){
        habRepo.deleteHabilidadesById(id);
    }

}