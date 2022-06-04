
package com.ap.portfolio.repository;

import com.ap.portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    void deleteEducacionById(Long id);
    
    Educacion findEducacionById(Long id);
}