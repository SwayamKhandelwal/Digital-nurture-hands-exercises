package com.cognizant.spring_learn;


import org.springframework.stereotype.Component;

@Component
public class Country {


    private String code;
    private String name;

    public Country() {
        System.out.println("country constructor");
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "country{" +
                "code= '" + code +
                ", name= '" + name +
                '}';
    }
}
