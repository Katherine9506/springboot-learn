package com.spring.springbootlearn.dao;

import com.spring.springbootlearn.domain.Spitter;
import org.springframework.stereotype.Repository;

@Repository
public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
