
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    void deletePersonaById(Long id);
    
    Persona findPersonaById(Long id);
}
