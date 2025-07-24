package com.quarkus.lab.repository;

import com.quarkus.lab.entity.QuarkusLabPersonEntity;

public interface IQuarkuLabPersonRepository {
    void salvar(QuarkusLabPersonEntity person);
}
