
package com.ap.portfolio.controller;


import com.ap.portfolio.model.Persona;
import com.ap.portfolio.service.PersonaService;
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
@RequestMapping("/persona")
public class ControllerPersona {
    @Autowired
    PersonaService personaService;

 
   @GetMapping("/all")
   public ResponseEntity<List<Persona>> getAllPersona () {
       List<Persona> personas = personaService.findAllPersonas();
       return new ResponseEntity<>(personas, HttpStatus.OK);
   
   }
   @GetMapping("/find/{id}")
   public ResponseEntity<Persona> getPersonaById (@PathVariable("id") Long id) {
       Persona persona = personaService.findPersona(id);
       return new ResponseEntity<>(persona, HttpStatus.OK);
   
   }
   @PostMapping("/add")
   public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
       Persona newpersona = personaService.addPersona(persona);
       return new ResponseEntity<>(newpersona, HttpStatus.CREATED);  
   }
   
   @PutMapping("/update")
    public ResponseEntity<Persona> updatePersona(@RequestBody Persona persona) {
       Persona updatepersona = personaService.updatePersona(persona);
       return new ResponseEntity<>(updatepersona, HttpStatus.OK);  
   }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable("id") Long id) {
       personaService.deletePersona(id);
       return new ResponseEntity<>(HttpStatus.OK);  
   }
   
    
}


















