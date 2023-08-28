package com.example.revisaoAula06.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Automação de Getters and Setters
@Builder // Automação de construtores
@NoArgsConstructor // cria construtores padrão, sem argumentos
@AllArgsConstructor // cria construtores com todos os argumentos dos atributos
@Entity // define a classe como entidade BD
public class Category {
    
    @Id // define que idProduct é a ID da classe (chave primária)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // implementação automática da chave única
    private long idCategory;
    
    private String nameCategory;
}
