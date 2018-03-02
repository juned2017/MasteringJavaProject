package com.company;

public class Main {


    public static void main(String[] args) {

        int juned =4;
        int wasi=5;

        String print= (wasi>juned)? "Hello":"Not true";
        System.out.println(print);



        for (int i=1; i<=6; i++){

            System.out.println("outer loop iteration: "+ i);
            for(int j=0; j<i+1; j++){

                System.out.println("i= "+i+ " ;j "+ j);

            }
        }
//
























//        Dimensions dimensions=new Dimensions(20,20,5);
//        Case theCase=new Case("22b","Dell","240",dimensions);
////        Monitor monitor=new Monitor("27inc lll","Acer",27,nativeResolution);
//        // or if you dont want to create
//                Monitor monitor=new Monitor("27inc lll","Acer",27,new Resolution(2540,1234));
//
//                Motherboard motherboard=new Motherboard("Bj-343","Asus",4,5,"v2.44");
//
//                PC thePc=new PC(theCase,monitor,motherboard);
//
//                //now if we want to access methods of those three classes
//
//
////        thePc.getTheCase().pressPowerButton(); better way of accessing it is below
//                thePc.powerUp();
//
//
//
//        //or



    }

    private static void addBlock(int i) {
        System.out.println(i);

    }
}
