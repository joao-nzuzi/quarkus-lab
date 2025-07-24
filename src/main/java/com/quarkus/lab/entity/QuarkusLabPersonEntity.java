package com.quarkus.lab.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "person")
@Setter @Getter
public class QuarkusLabPersonEntity {
    @Id
    @Column(nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String sobrenome;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String estadoCivil;
}
