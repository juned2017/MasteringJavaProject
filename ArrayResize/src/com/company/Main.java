package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    private static int baseDate[]=new int[10];

    public static void main(String[] args) {

        getInput();
        printArray(baseDate);

        System.out.println("Enter 12 integers");
        resizeArray();
        getInput();
        printArray(baseDate);





	// write your code here
    }
    private static void  getInput (){
        System.out.println("Enter 10 integers");
        for(int i=0; i<baseDate.length; i++){

            baseDate[i]=scanner.nextInt();

        }

    }
    private static void printArray(int array []){
        for (int i=0; i<array.length; i++){
            System.out.println("At Element "+" " + i+ "integer is " + array[i]);
        }

    }
    private static void resizeArray(){

        int []original=baseDate;

        baseDate=new int[12];
        for (int i=0; i<original.length; i++){
            baseDate[i]=original[i];
        }

    }
}
