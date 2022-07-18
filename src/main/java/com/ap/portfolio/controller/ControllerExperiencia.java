package com.ap.portfolio.controller;

import com.ap.portfolio.model.Experiencia;
import com.ap.portfolio.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/experiencia")
public class ControllerExperiencia {
    @Autowired
    ExperienciaService experienciaService;
    
   @GetMapping("/all")
   public ResponseEntity<List<Experiencia>> getAllExperiencia () {
       List<Experiencia> experiencia = experienciaService.findAllExperiencia();
       return new ResponseEntity<>(experiencia, HttpStatus.OK);
   
   }
   @GetMapping("/find/{id}")
   public ResponseEntity<Experiencia> getExperienciaById (@PathVariable("id") Long id) {
       Experiencia experiencia = experienciaService.findExperiencia(id);
       return new ResponseEntity<>(experiencia, HttpStatus.OK);
   
   }
   
   @PostMapping("/add")
   public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia experiencia) {
       Experiencia newexperiencia = experienciaService.addExperiencia(experiencia);
       return new ResponseEntity<>(newexperiencia, HttpStatus.CREATED);  
   }
   
   @PutMapping("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia) {
       Experiencia updateexperiencia = experienciaService.updateExperiencia(experiencia);
       return new ResponseEntity<>(updateexperiencia, HttpStatus.OK);  
   }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id) {
       experienciaService.deleteExperiencia(id);
       return new ResponseEntity<>(HttpStatus.OK);  
   }

}