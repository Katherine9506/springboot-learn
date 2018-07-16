package com.spring.springbootlearn.service.impl;

import com.spring.springbootlearn.dao.SpittleRepository;
import com.spring.springbootlearn.domain.Spittle;
import com.spring.springbootlearn.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleServiceImpl implements SpittleService {
    @Autowired
    private SpittleRepository spittleRepository;

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return spittleRepository.findSpittles(max, count);
    }

    @Override
    public Spittle findOne(long spittleId) {
        return spittleRepository.findOne(spittleId);
    }
}
