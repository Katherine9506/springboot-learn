package com.spring.springbootlearn.controller;

/**
 * @description: TODO
 * @author: Katherine
 * @create: 2018/5/3 15:56
 */
public class MyPojo {
    private String name;
    private String description;


//    public MyPojo() {
//    }

//    public MyPojo(String name, String description) {
//        this.name = name;
//        this.description = description;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Override
//    public String toString() {
//        return "MyPojo{" +
//                "name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
