package com.company;

//interface and abstract class is similar in some ways. in  Abstract class we can add fields and constructor and regular methods, and specify methods as abstract
// cannot instiate abstract class/  can have public/private methods

//interface can have variable that are public static final , which is constant value that u will not change, they need to be static b/c non-static u woulld need
// an instance to access them. cannot have constructor, all methods public

public abstract class Animal {

  private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
