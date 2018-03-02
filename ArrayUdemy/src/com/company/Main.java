package com.company;

import java.util.Scanner;

public class Main {







    public static Scanner scanner=new Scanner(System.in);


    public static void main(String[] args) {


        int []myInteger=getIngers(5);
        for(int i=0; i<myInteger.length; i++){
            System.out.println("Element "+i+", typed value was "+ myInteger[i]);
        }
        System.out.println("the average is "+ getAverage(myInteger));

    }

    public static int[]getIngers(int number){
        System.out.println("Enter "+ number+ "integer values.\r");
        int[]values=new int[number];

        for (int i=0; i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int []array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}






//        int[] myIntArray = new int[10];
//
//        int[] secondArray = new int[25];
//
//
//        myIntArray[5] = 50;
//
//        System.out.println(myIntArray[5]);
//        int length = myIntArray.length;
//        System.out.println(length);
//
//
//        int secondLength = secondArray.length;
//
//        printArray(secondArray);
//
//
//    }
//
//
//    public static void printArray(int[] myArray) {
//        int i2 = 0;
//        if (i2 <= myArray.length) {
//            for (int i = 0; i <= myArray.length; i++) {
//                myArray[i] = i * 5;
//
//                System.out.println("Element" + " " + i + " " + "value is" + " " + myArray[i]);
//
//            }
// write your code here
//        }