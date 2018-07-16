package com.spring.springbootlearn.dao;

import com.spring.springbootlearn.domain.Spitter;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SpitterRepository {
    @Insert("insert into spitters values(#{firstName},#{lastName},#{username},#{password})")
    Spitter save(Spitter spitter);

    @Select("select * from spitters where username = #{username}")
    Spitter findByUsername(String username);
}
