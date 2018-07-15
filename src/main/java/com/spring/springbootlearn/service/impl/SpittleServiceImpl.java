package com.spring.springbootlearn.service.impl;

import com.spring.springbootlearn.domain.Spittle;
import com.spring.springbootlearn.service.SpittleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpittleServiceImpl implements SpittleService {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Override
    public Spittle findOne(long spittleId) {
        return null;
    }
}
