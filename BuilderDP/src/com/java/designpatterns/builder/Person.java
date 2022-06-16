package com.java.designpatterns.builder;

public class Person {
    private String name;
    private String age;
    private String address;
    private String country;


    public Person name(String name) {
        this.name = name;
        return this;
    }

    public Person age(String age) {
        this.age = age;
        return this;
    }

    public Person address(String address) {
        this.address = address;
        return this;
    }

    public Person country(String country) {
        this.country = country;
        return this;
    }

    public String build() {
        if (this.country.equalsIgnoreCase("unknown")) {
            return "Person's details: \n name: " + this.name + "\n age: " + this.age + "\n address: " + this.address + "\n country: " + this.country;
        } else {
            return "Person's details: \n name: " + this.name + "\n age: " + this.age + "\n address: " + this.address + "\n country: " + this.country;
        }
    }
}


