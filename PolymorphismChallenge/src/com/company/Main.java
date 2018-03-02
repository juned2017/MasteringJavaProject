package com.company;

class Car{

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car (){

    }
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }



    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car >>startEngine()";
    }

    public String accelerate(){
        return "Car >>>accelerate()";
    }

    public String brake(){
        return "car>>>>break()";
    }

}

class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi >>startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ "mitsubishi accelerate >>accelerate()";
    }

    @Override
    public String brake() {
        return "brake >>brake()";
    }
}

class Ford extends Car{



    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine() {
        return "Ford >>startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford accelerate >>accelerate()";
    }

    @Override
    public String brake() {
        return "Ford brake >>brake()";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden >>startEngine()";
    }

    @Override
    public String accelerate() {
        return "holden accelerate >>accelerate()";
    }

    @Override
    public String brake() {
        return "Holden brake >>brake()";
    }
}

public class Main {

    public static void main(String[] args) {


        Mitsubishi mitsubishi = new Mitsubishi(5, "Mitsubishi");
        System.out.println(mitsubishi.accelerate());


       for (int i=1; i<4; i++){

           Car car=getAllCar();

           System.out.println(car.accelerate());



       }





    }


    public static Car getAllCar() {

        int randomNumber=(int) (Math.random()*5)+1;

        switch (randomNumber){

            case 1:
                return new Ford(4,"Ford");

            case 2: return new Mitsubishi(3,"Mitshubishi");

            case 3: return new Holden(5,"HOlden");


        }


        return null;
    }

}






//    private int doors;
//    private int wheels;
//    private int gears;
//    private String carName;
//    private boolean engine;
//
//    public Car(int doors, int gears, String carName) {
//        this.doors = doors;
//        this.wheels =4;
//        this.gears = gears;
//        this.carName = carName;
//        this.engine = true;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getGears() {
//        return gears;
//    }
//
//    public String getCarName() {
//        return carName;
//    }
//
//    public boolean isEngine() {
//        return engine;
//    }
//
//    public void startEngine(){
//        System.out.println("engine starting");
//    }
//
//    public void accelerateCar(int speed){
//        System.out.println("car is accelerating at:"+ speed+ " "+" mile/hr");
//    }
//}
//
//class Ford extends Car{
//
//    public Ford (){
//        super(4,2,"Ford Fusion");
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("engine starts slow");
//    }
//
//    @Override
//    public void accelerateCar(int speed) {
//        if (speed<30){
//            System.out.println("this car is driving very slowely");
//
//        }
//    }
//}
//
//
//class Gm extends Car{
//
//    public Gm(){
//        super(5,3,"General Motos");
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("general motor car starting here");
//    }
//
//    @Override
//    public void accelerateCar(int speed) {
//
//        if(speed>40){
//            System.out.println("car is driving normal ");
//
//        }
//    }
//}
//
//class BMW extends Car{
//    public BMW() {
//        super(4,7,"BMW");
//    }
//
//    @Override
//    public void startEngine() {
//        System.out.println("BMW engine is starting here");
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//
//        for (int i=1; i<4; i++){
//
//            Car cars=getCars();
//
//            System.out.println(cars.getCarName());
//
//            System.out.println(cars.getDoors());
//
//        }
//
//    }
//
//    public static Car getCars(){
//
//        int randomNumber=(int) (Math.random()*5)+1;
//
//
//        switch (randomNumber){
//            case 1:
//                return new Gm();
//
//            case 2:
//                return new Ford();
//
//            case 3:
//                return new BMW();
//
//            default:return null;
//        }
//
//    }

