package com.company;

//composition deals with a (has a part of something else in relation, for example computer has a motherboard, has a monitor ....)

public class Car extends Vehicle{
    private int door;
    private int engineCapacity;

    public Car(String name, int door, int engineCapacity) {
        super(name);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }
}
