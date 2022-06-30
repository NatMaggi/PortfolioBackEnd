/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.portfolio.controller;


import com.ap.portfolio.model.Proyectos;

import com.ap.portfolio.service.ProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("/proyectos")
public class ControllerProyectos {
        @Autowired
        ProyectosService  proyectosService;
    
   @GetMapping("/all")
   public ResponseEntity<List<Proyectos>> getAllProyectos () {
       List<Proyectos> proyectos = proyectosService.findAllProyectos();
       return new ResponseEntity<>(proyectos, HttpStatus.OK);
   
   }
   @GetMapping("/find/{id}")
   public ResponseEntity<Proyectos> getProyectosById (@PathVariable("id") Long id) {
       Proyectos proyectos = proyectosService.findProyectos(id);
       return new ResponseEntity<>(proyectos, HttpStatus.OK);
   
   }
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/add")
   public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos) {
       Proyectos newproyectos = proyectosService.addProyectos(proyectos);
       return new ResponseEntity<>(newproyectos, HttpStatus.CREATED);  
   }
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos(@RequestBody Proyectos proyectos) {
       Proyectos updateproyectos = proyectosService.updateProyectos(proyectos);
       return new ResponseEntity<>(updateproyectos, HttpStatus.OK);  
   }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyectos(@PathVariable("id") Long id) {
       proyectosService.deleteProyectos(id);
       return new ResponseEntity<>(HttpStatus.OK);  
   }

}