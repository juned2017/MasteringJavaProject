package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
Animal animal=new Animal(3,4,5,6,"animal");

Fish fish=new Fish(4,45,"neemo",3,3,6);
System.out.println("body of fish is " + " " + fish.getBody());

Dog dog=new Dog(1,20,"yorkie",4,1,20,2,"long silky");

dog.eat();
dog.move(8);


    }
}
