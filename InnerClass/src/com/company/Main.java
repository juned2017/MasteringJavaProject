package com.company;

import java.util.Scanner;

public class Main {
    //four types of nested classes in java
    // 1) static 2. non static 3. local class which is defined inside a block like in method or if statement 4. anonymous class without a name

    //it is packaged withing a outer class, so it can't access outer class static variables
    private static Scanner scanner=new Scanner(System.in);
    private static Button btnPrint=new Button("Print");

    public static void main(String[] args) {




//        GearBox mcLaren = new GearBox(6);
////        mcLaren.addGear(1, 5.3);
////        mcLaren.addGear(2, 10.6);
////        mcLaren.addGear(3, 15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpee(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpee(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpee(4000));

        //reference outer class frist. inner class and initilzing it by usin the variable of outer class. inner claas
//        GearBox.Gear first=mcLaren.new Gear(1,12.2);
//        System.out.println(first.driveSpeed(1000));

//
         //local clas is created here
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attatched");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+ " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());




        //ananomys class is used

        btnPrint.setOnClickListener(new Button.OnClickListener() { //anonomous class was implemented
            //between the bracket
            @Override
            public void onClick(String title) {
                System.out.println(title+ " was clicked");
            }
        });
        listen();


    }
    private static void listen(){
        boolean quit=false;
        while (!quit){
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit=true;
                    break;

                case 1:
                    btnPrint.onClick();

            }


        }
    }
}
