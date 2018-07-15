package com.spring.springbootlearn.service;

import com.spring.springbootlearn.domain.Spittle;

import java.util.List;

public interface SpittleService {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
