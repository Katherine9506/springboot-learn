package com.spring.springbootlearn.dao;

import com.spring.springbootlearn.domain.Spittle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/29 15:57
 */
@Repository
@Mapper
public interface SpittleRepository {
    @Select("select * from spittles where id < #{max} and count = #{count}}")
    List<Spittle> findSpittles(long max, int count);

    @Select("select * from spittles where id = #{spittleId}")
    Spittle findOne(long spittleId);
}
