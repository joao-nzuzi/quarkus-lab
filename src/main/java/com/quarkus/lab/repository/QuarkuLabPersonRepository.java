package com.quarkus.lab.repository;

import com.quarkus.lab.entity.QuarkusLabPersonEntity;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class QuarkuLabPersonRepository implements IQuarkuLabPersonRepository{

    @Inject
    EntityManager entityManager;
    @Override
    public void salvar(QuarkusLabPersonEntity person) {
        entityManager.persist(person);
    }
}
