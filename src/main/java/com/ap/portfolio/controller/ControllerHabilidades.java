
package com.ap.portfolio.controller;


import com.ap.portfolio.model.Habilidades;
import com.ap.portfolio.service.HabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/habilidades")
public class ControllerHabilidades {
    @Autowired
    HabilidadesService habilidadesService;
    
   @GetMapping("/all")
   public ResponseEntity<List<Habilidades>> getAllHabilidades () {
       List<Habilidades> habilidades = habilidadesService.findAllHabilidades();
       return new ResponseEntity<>(habilidades, HttpStatus.OK);
   
   }
   @GetMapping("/find/{id}")
   public ResponseEntity<Habilidades> getEducacionById (@PathVariable("id") Long id) {
       Habilidades habilidades = habilidadesService.findHabilidades(id);
       return new ResponseEntity<>(habilidades, HttpStatus.OK);
   
   }
   
   @PostMapping("/add")
   public ResponseEntity<Habilidades> addHabilidades(@RequestBody Habilidades habilidades) {
       Habilidades newhabilidades = habilidadesService.addHabilidades(habilidades);
       return new ResponseEntity<>(newhabilidades, HttpStatus.CREATED);  
   }
   
   @PutMapping("/update")
    public ResponseEntity<Habilidades> updateHabilidades(@RequestBody Habilidades habilidades) {
       Habilidades updatehabilidades = habilidadesService.updateHabilidades(habilidades);
       return new ResponseEntity<>(updatehabilidades, HttpStatus.OK);  
   }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHabilidades(@PathVariable("id") Long id) {
       habilidadesService.deleteHabilidades(id);
       return new ResponseEntity<>(HttpStatus.OK);  
   }

}
