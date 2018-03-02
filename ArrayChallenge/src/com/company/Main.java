package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {



        int[] myInteger = getIngegers(3);
//        int [] value=myInteger;
//        System.out.println("value at index 2 is " + "" + value);
       int []sortedIntegers= sortIntegers(myInteger);
        printArray(sortedIntegers);


    }

    public static int[] getIngegers(int capacity) {

        System.out.println("Enter" + " " + capacity + " " + "integer values.\r");

        int[] array = new int[capacity];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        return array;
    }



    public static void printArray(int []array){
        for (int i = 0; i < array.length; i++) {
//
            System.out.println("element " + i + " " + "contents"+" " + array[i]);
//
        }

    }

//    public static int[] printArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println("element " + i + " " + "typed value was " + array[i]);
//
//        }
//
//        return array;
//    }


    public static int []sortIntegers(int []array){

        //copies the array passed in to sortedArray
        int[]sortedArray=new int[array.length];
        for(int i=0; i<array.length; i++){ //going through the loop to save each element passed in to sortedArray
            sortedArray[i]=array[i];


        }


        boolean flag=true;
        int temp;



        while (flag){
            flag=false;

            //element 0 50
            //element 1  160
            //element  2   40
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){  //is 50 < 160
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;





    }

}
