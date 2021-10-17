package com.company.manage.model;

public abstract class Person {
    private int id;
    private String name;
    private int age;
    public static String company = "C08 Group :)))";

    public Person(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
