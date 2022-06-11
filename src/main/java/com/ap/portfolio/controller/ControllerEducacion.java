package com.ap.portfolio.controller;

import com.ap.portfolio.model.Educacion;
import com.ap.portfolio.service.EducacionService;
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


@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/educacion")
public class ControllerEducacion {
   @Autowired
   EducacionService educacionService;
    
   @GetMapping("/all")
   public ResponseEntity<List<Educacion>> getAllEducacion () {
       List<Educacion> educacion = educacionService.findAllEducacion();
       return new ResponseEntity<>(educacion, HttpStatus.OK);
   
   }
   @GetMapping("/find/{id}")
   public ResponseEntity<Educacion> getEducacionById (@PathVariable("id") Long id) {
       Educacion educacion = educacionService.findEducacion(id);
       return new ResponseEntity<>(educacion, HttpStatus.OK);
   
   }
   @PostMapping("/add")
   public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
       Educacion neweducacion = educacionService.addEducacion(educacion);
       return new ResponseEntity<>(neweducacion, HttpStatus.CREATED);  
   }
   
   @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
       Educacion updateeducacion = educacionService.updateEducacion(educacion);
       return new ResponseEntity<>(updateeducacion, HttpStatus.OK);  
   }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id) {
       educacionService.deleteEducacion(id);
       return new ResponseEntity<>(HttpStatus.OK);  
   }

}
