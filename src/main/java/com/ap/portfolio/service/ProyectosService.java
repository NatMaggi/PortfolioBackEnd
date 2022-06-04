
package com.ap.portfolio.service;

import com.ap.portfolio.model.Proyectos;

import com.ap.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    private final ProyectosRepository proRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepository proRepo) {
        this.proRepo = proRepo;
    }
    
    public Proyectos addProyectos(Proyectos proyectos){
        return proRepo.save(proyectos);
    }
    
    public List <Proyectos> findAllProyectos() {
        return proRepo.findAll();
    }
    
    public Proyectos updateProyectos(Proyectos proyectos) {
        return proRepo.save(proyectos);
    }   
    
    public Proyectos findProyectos(Long id){
        return proRepo.findProyectosById(id);
    
    }
    public void deleteProyectos(Long id){
        proRepo.deleteProyectosById(id);
    }

}