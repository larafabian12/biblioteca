package com.lara.biblioteca.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="EDITORA")
@Data
public class EditoraEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   
   @Column(name = "ID_EDITORA")
   private Integer id;

   @Column(name = "NOME")
   private String nome;
}
