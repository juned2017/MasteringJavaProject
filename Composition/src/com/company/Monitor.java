package com.company;

public class Monitor {


    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    //private Resolution nativeResolution; is known as composition. The Resolution class is part of the monitor class. a monitor
    //isn't a Resolution but it (has a resolution) resolution is a component of a monitor

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }



    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y,String color){

        System.out.println("Drawing pixel at "+x+" "+ y+" in colour"+ color);

    }
}
