package com.company;

public class Penguin extends Bird implements CanFly {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {

        System.out.println("penguin dosen't fly");
    }
}
