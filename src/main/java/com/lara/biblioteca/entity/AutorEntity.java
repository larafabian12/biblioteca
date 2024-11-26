package com.lara.biblioteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "AUTOR")
public class AutorEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID_AUTOR")
    private Integer id;

    @Column(name ="NOME")
    private String nome;

    @Column(name ="DESCRICAO")
    private String descricao;

    @Column(name ="GENERO_TEXTUAL")
    private String generoTextual;
}
