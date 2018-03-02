package com.company;

public class Parrot extends Bird {

    //you can choose to overide all the methods from Bird if you want

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Flying from branch to branch");

    }

}
