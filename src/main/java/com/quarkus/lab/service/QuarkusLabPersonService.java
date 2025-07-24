package com.quarkus.lab.service;

import com.quarkus.lab.entity.QuarkusLabPersonEntity;
import com.quarkus.lab.repository.IQuarkuLabPersonRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class QuarkusLabPersonService implements IQuarkusLabPersonService{

    @Inject
    IQuarkuLabPersonRepository personRepository;

    @Override
    public void salvar(QuarkusLabPersonEntity person) {
        personRepository.salvar(person);
    }
}
