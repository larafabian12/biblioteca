package com.lara.biblioteca.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "LIVRO")


public class LivroEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_LIVRO")
    private Integer Id;

    @Column(name = "NOME")
    private String nome;


    @Column(name = "SINOPSE")
    private String sinopse;


    @Column(name = "GENERO_TEXTUAL")
    private String generoTextual;


    @Column(name = "CLASSIFICACAO_INDICATIVA")
    private String classificacaoIndicativa;


    @Column(name = "QUANT_PAGINA")
    private Integer quantPaginas;


    @Column(name = "ESTANTE")
    private String estante;


    @Column(name = "ANO_PUBLICACAO")
    private Integer  anopublicacao;
}
