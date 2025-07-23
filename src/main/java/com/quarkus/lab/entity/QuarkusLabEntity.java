package com.quarkus.lab.entity;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "usuarios")
@Cacheable
public class QuarkusLabEntity extends PanacheEntity {

    @Column(nullable = false)
    public String username;
    @Column(unique = true)
    public String email;
    @Column(length = 13, unique = true)
    public String telefone;
    @Column(length = 255, unique = true, nullable = false)
    public String password;




}
