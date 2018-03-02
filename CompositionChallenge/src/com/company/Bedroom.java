package com.company;

public class Bedroom {


    private String name;
    private Wall wall1;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;


    public Bedroom(String name, Wall wall1, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void turnLampOn(){
        lamp.turnOn();
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public void makeBed(){
        System.out.println("Bedroom >>making bed");
        bed.make();
    }



}
