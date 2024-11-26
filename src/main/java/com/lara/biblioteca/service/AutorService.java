package com.lara.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.biblioteca.dto.AutorRequestDTO;
import com.lara.biblioteca.entity.AutorEntity;
import com.lara.biblioteca.repository.AutorRepository;

@Service

public class AutorService {
      
    @Autowired
    private AutorRepository repository;

    public AutorEntity criar(AutorRequestDTO dto){
        AutorEntity autor = new  AutorEntity();
        autor.setNome(dto.getNome());

        autor.setDescricao(dto.getDescricao());

        autor.setGeneroTextual(dto.getGeneroTextual());
        AutorEntity criado = repository.save(autor);
        return criado;
    }  

    public List<AutorEntity> listar()   
    {
        return repository.findAll();
    } 
    
    public AutorEntity alterar(Integer id, AutorRequestDTO dto){
        AutorEntity optAutor = repository.findById(id)
        .orElseThrow( ()->new RuntimeException("Não encontrado"));

        optAutor.setNome(dto.getNome());
        optAutor.setDescricao(dto.getDescricao());
        optAutor.setGeneroTextual(dto.getGeneroTextual());

        AutorEntity alterado = repository.save(optAutor);
        return alterado;
    }
}

