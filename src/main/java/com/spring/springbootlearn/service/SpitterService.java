package com.spring.springbootlearn.service;

import com.spring.springbootlearn.domain.Spitter;

public interface SpitterService {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}

