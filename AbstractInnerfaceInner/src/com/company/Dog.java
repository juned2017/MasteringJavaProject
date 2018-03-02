package com.company;

public class Dog extends Animal {

    public Dog(String name) {
        super(name); //using super to call the constructor of Animal class
    }

    @Override
    public void eat() {

        System.out.println(getName() + " is eatting");

    }

    @Override
    public void breathe() {
        System.out.println("Breathe, repeat");
    }
}
