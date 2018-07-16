package com.spring.springbootlearn.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/test")
    public MyPojo testRequestBody(@RequestBody MyPojo myPojo) {
        return myPojo;
    }

    @PostMapping("/test2")
    public MyPojo testRequestBody2(MyPojo myPojo) {
        return myPojo;
    }

    @PostMapping("/test3")
    public String testRequestBody3(String name, String description) {
        return name + ":" + description;
    }

    @PostMapping("/test4")
    public String testRequestBody4(String description, String name) {
        return name + ":" + description;
    }

    @PostMapping("/test/{id}")
    public String testPathVariable(Integer id) {
        return "id:" + id;
    }

    @PostMapping("/test2/{id}")
    public String testPathVariable2(@PathVariable Integer id) {
        return "id:" + id;
    }
}
