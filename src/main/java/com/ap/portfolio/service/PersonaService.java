
package com.ap.portfolio.service;

import com.ap.portfolio.model.Persona;
import com.ap.portfolio.repository.PersonaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepository persoRepo;
    
    @Autowired
    public PersonaService(PersonaRepository persoRepo) {
        this.persoRepo = persoRepo;
    }
    
    public Persona addPersona(Persona persona){
        return persoRepo.save(persona);
    }
    
    public List <Persona> findAllPersonas() {
        return persoRepo.findAll();
    }
    
    public Persona updatePersona(Persona persona) {
        return persoRepo.save(persona);
    }   
    
    public Persona findPersona(Long id){
        return persoRepo.findPersonaById(id);
    
    }
    public void deletePersona(Long id){
        persoRepo.deletePersonaById(id);
    }

}
















