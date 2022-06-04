
package com.ap.portfolio.service;

import com.ap.portfolio.model.Experiencia;
import com.ap.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
        private final ExperienciaRepository expRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository expRepo) {
        this.expRepo = expRepo;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return expRepo.save(experiencia);
    }
    
    public List <Experiencia> findAllExperiencia() {
        return expRepo.findAll();
    }
    
    public Experiencia updateExperiencia(Experiencia experiencia) {
        return expRepo.save(experiencia);
    }   
    
    public Experiencia findExperiencia(Long id){
        return expRepo.findExperienciaById(id);
    
    }
    public void deleteExperiencia(Long id){
        expRepo.deleteExperienciaById(id);
    }

}

