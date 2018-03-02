package com.company;

//created this class based on the animal class and added additional characterstic and behavior.

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(int brain, int body, int size, int weight, String name) {
//        super(brain, body, size, weight, name);
//    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("Animal class eat method not called, i just override that one here");
        System.out.println("animal class eat method called bellow");

        //run the super class eat method not eat from this class if there was one
        super.eat();
    }
    public void walk(){
        System.out.println("dog walking at ");
        move(4);

    }
    public void run(){


    }

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;


    }

    //the move method below is now of dog class since we overide it.
    @Override
    public void move(int speed) {
        System.out.println("Dog.move is called ");
        super.move(speed);
    }
}
