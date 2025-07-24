package com.quarkus.lab.service;

import com.quarkus.lab.entity.QuarkusLabPersonEntity;

public interface IQuarkusLabPersonService {
    void salvar(QuarkusLabPersonEntity person);
}
