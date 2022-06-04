
package com.ap.portfolio.service;

import com.ap.portfolio.model.Educacion;
import com.ap.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
        private final EducacionRepository eduRepo;
    
    @Autowired
    public EducacionService(EducacionRepository eduRepo) {
        this.eduRepo = eduRepo;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return eduRepo.save(educacion);
    }
    
    public List <Educacion> findAllEducacion() {
        return eduRepo.findAll();
    }
    
    public Educacion updateEducacion(Educacion educacion) {
        return eduRepo.save(educacion);
    }   
    
    public Educacion findEducacion(Long id){
        return eduRepo.findEducacionById(id);
    
    }
    public void deleteEducacion(Long id){
        eduRepo.deleteEducacionById(id);
    }

}

