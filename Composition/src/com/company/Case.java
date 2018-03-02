package com.company;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimenstions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimenstions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimenstions = dimenstions;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimenstions() {
        return dimenstions;
    }

    public void pressPowerButton(){
        System.out.println("pwer button is pressed");
    }
}
