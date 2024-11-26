package com.lara.biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorRequestDTO {
    
  private String nome;  

  private String descricao;  

  private String generoTextual;  
}
