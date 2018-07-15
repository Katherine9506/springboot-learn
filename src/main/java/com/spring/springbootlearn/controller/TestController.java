package com.spring.springbootlearn.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/3 15:14
 */
@ConfigurationProperties(prefix = "foo")
@RestController
@RequestMapping("/test")
public class TestController {

    private String Hello;

    public void setHello(String hello) {
        this.Hello = hello;
    }

//    public String getHello() {
//        return hello;
//    }

    private final List<MyPojo> list = new ArrayList<>();

    public List<MyPojo> getList() {
        return list;
    }

    @PostMapping("list")
    public List<MyPojo> list() {
        return this.list;
    }

    @PostMapping("index")
    public String index() {
        return LoggingSystem.SYSTEM_PROPERTY;
    }

    @GetMapping("hello")
    public String hello() {
        return "hello springboot";
    }
}
