package com.base.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
//        Person p=new Person();
//        p.setName("dsd");
//        p.setLastName("dsd");

        PersonBuilder builder = new PersonBuilder();
        Person person = builder.setName("ali").setAge("30").setLastName("sadeghi").build();
        System.out.println(person);
    }
}
