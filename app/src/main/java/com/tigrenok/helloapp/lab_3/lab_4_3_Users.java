package com.tigrenok.helloapp.lab_3;

import java.io.Serializable;

public class lab_4_3_Users implements Serializable {
    private String name;
    private String company;
    private int age;

    public lab_4_3_Users(String name, String company, int age) {
        this.name = name;
        this.company = company;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}