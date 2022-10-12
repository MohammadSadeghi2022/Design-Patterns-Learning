package com.base.DesignPatterns.Builder;

public class PersonBuilder {
    private String name;
    private String lastName;
    private String fatherName;
    private String age;
    private String gender;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public PersonBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        return new Person(name, lastName, fatherName, age, gender);
    }
}