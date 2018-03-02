package com.company;

public class Main {

    public static void main(String[] args) {


Ceiling ceiling=new Ceiling("green");
Wall wall=new Wall("East");
Bed bed=new Bed("modern",5,3,4);
Lamp lamp=new Lamp("classic",false,5);




Bedroom bedroom=new Bedroom("juned",wall,ceiling,bed,lamp);

bedroom.makeBed();

bedroom.getLamp().turnOn();

//or
        bedroom.turnLampOn();



    }
}
