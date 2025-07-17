package com.quarkus.lab.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class QuarkusLabService {

    public String saudacao(String nome){
        return "Olá, " +nome;
    }
}
