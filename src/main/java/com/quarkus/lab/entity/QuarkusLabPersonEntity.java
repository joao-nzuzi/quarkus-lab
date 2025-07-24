package com.quarkus.lab.entity;

import jakarta.persistence.*;

@Entity(name = "person")
public class QuarkusLabPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String sobrenome;
    private String sexo;


}
