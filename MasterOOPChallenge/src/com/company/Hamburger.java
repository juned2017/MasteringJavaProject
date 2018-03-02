package com.company;

public class Hamburger {


    //create a base hamburger, but also two other type of hamburger that are populer one
    //basic hamburger shoul have the following items
    //bread roll type, meat and up to 4 additions (lettuce, tomator, carrot, etc)
    //the customer add to burger, each one of these itesms gets charged an additional price, so need some way ot track how many items got added and
    //calculate the price (base+additions)
    //create hamburger class to deal with all the above
    //constgructor should only include the name, roll type, meat and price.
    //also creat two other varitey of hamb clsses to cater for healthy burger (on a brown rye bread roll), plus tow addition items can be added
    //healthy burger can have a total of 6 items (Additions)
    //in total
    ///hint: you probably want to process the 2 additional items in this new class, not the base class,
    //since the 2 additions are only approiate for this new class
    //b) Deluxe hamburger-comes with chips and drinks as additions, but no extra additions are allowed
    //hint: you have to find a way to automatically addd thse new additions at the time the deluxe burger object is created, and then
    //prevent other additions being made
    //all 3 classes should have a method that can be call anytime to show the base price of the hambrger
    //p;us all additionals, each showing the addition name, addition price, and a grand total for the burnger
    //for the two additional classes this may require you to be looking at the base class for pricing and then adding totals onto that.


    private String name;
    private String meat;
    private double price;
    private String breadRoll;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;


    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoll = breadRoll;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice=this.price;

        System.out.println(this.name+ "hamburger" + " " + " on a "+ this.breadRoll + "roll"+this.meat+  " " + "price is"+ this.price);

        if(this.addition1Name!=null){
            hamburgerPrice+=this.addition1Price;
            System.out.println("Added"+ this.addition1Name+ "for an extra "+ "$"+this.addition1Price);
        }
        if(this.addition2Name!=null){
            hamburgerPrice+=this.addition2Price;
            System.out.println("Added"+ this.addition2Name+ "for an extra "+ "$"+this.addition2Price);
        }
        if(this.addition3Name!=null){
            hamburgerPrice+=this.addition3Price;
            System.out.println("Added"+ this.addition1Name+ "for an extra "+ "$"+this.addition3Price);
        }
        if(this.addition4Name!=null){
            hamburgerPrice+=this.addition4Price;
            System.out.println("Added"+ this.addition1Name+ "for an extra "+ "$"+this.addition4Price);
        }
        return hamburgerPrice;
    }
}


//    private String breadRollType;
//    private String typesOfMeat;
//    private String lettuce;
//    private String tomato;
//    private String carrot;
//    private String olives;
//
//    private double basePrice=4.00;
//
//    public Hamburger(String breadRollType, String typesOfMeat, String lettuce, String tomato, String carrot, String olives) {
//        this.breadRollType = breadRollType;
//        this.typesOfMeat = typesOfMeat;
//        this.lettuce = lettuce;
//        this.tomato = tomato;
//        this.carrot = carrot;
//        this.olives = olives;
//    }
//
//    public void setBreadRollType(String breadRollType) {
//        this.breadRollType = breadRollType;
//    }
//
//    public void setTypesOfMeat(String typesOfMeat) {
//        this.typesOfMeat = typesOfMeat;
//    }
//
//    public void setLettuce(String lettuce) {
//        this.lettuce = lettuce;
//    }
//
//    public void setTomato(String tomato) {
//        this.tomato = tomato;
//    }
//
//    public void setCarrot(String carrot) {
//        this.carrot = carrot;
//    }
//
//    public void setOlives(String olives) {
//        this.olives = olives;
//    }
//
//    public void setBasePrice(double basePrice) {
//        this.basePrice = basePrice;
//    }
//
//
//    public double priceAfterAddedItem(String extraItem){
//
//
//
//
//    }
//}
