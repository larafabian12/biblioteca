package com.lara.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lara.biblioteca.dto.AutorRequestDTO;
import com.lara.biblioteca.entity.AutorEntity;
import com.lara.biblioteca.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService service;

 @GetMapping
 public List<AutorEntity> listar() {
  List<AutorEntity> autores = service.listar();
  return autores;
 }
 
@PostMapping
public AutorEntity criar(@RequestBody AutorRequestDTO dto ){
   AutorEntity criado = service.criar(dto);
   return criado;
  }

 @PatchMapping("/{id}")
 public AutorEntity alterar(@RequestBody AutorRequestDTO dto, @PathVariable Integer id){
  AutorEntity alterado = service.alterar(id, dto);
  return alterado;
 }
}


    

