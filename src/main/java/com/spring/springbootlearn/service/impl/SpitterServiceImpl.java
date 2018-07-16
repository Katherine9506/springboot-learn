package com.spring.springbootlearn.service.impl;

import com.spring.springbootlearn.dao.SpitterRepository;
import com.spring.springbootlearn.domain.Spitter;
import com.spring.springbootlearn.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpitterServiceImpl implements SpitterService {
    @Autowired
    private SpitterRepository spitterRepository;

    @Override
    public Spitter save(Spitter spitter) {
        return spitterRepository.save(spitter);
    }

    @Override
    public Spitter findByUsername(String username) {
        return spitterRepository.findByUsername(username);
    }
}
