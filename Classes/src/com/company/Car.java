package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colur;


    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColur() {
        return colur;
    }


    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("porche")|| validModel.equals("holden")){
            this.model = model;
        }else {
            this.model="Unknown value";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColur(String colur) {
        this.colur = colur;
    }


}
