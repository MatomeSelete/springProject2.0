package com.spring;

public class Customer {
    private Integer id;
    private String name;
    private String email;
    private  Integer age;

    public Customer( Integer id,
        String name,
        String email,
        Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Customer() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }


 }


