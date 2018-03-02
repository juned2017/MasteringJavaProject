package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger=new Hamburger("Basic ","chicken",4.5,"brown");

       double price= hamburger.itemizeHamburger();

       hamburger.addHamburgerAddition1("tomatoe",1.00);
       hamburger.addHamburgerAddition2("lettuce",0.45);

       System.out.println("total burger price is" + hamburger.itemizeHamburger());


       HealthyBurger healthyBurger=new HealthyBurger("chicken",4);
       healthyBurger.addHealthAddition1("lentil",1);
       healthyBurger.addHamburgerAddition1("egg",4);

       System.out.println("Total price is "+ healthyBurger.itemizeHamburger());


    }
}
