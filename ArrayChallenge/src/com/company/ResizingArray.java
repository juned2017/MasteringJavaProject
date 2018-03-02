package com.company;

import java.util.Scanner;

public class ResizingArray {


    public String accessArray;

    Scanner scanner=new Scanner(System.in);

    private static int[] baseData =new int[10];




    public ResizingArray(){




    }

    public void getInput(){

        for (int i=0; i<baseData.length; i++){
            System.out.println("enter" + baseData+ " "+ "integer value");
            baseData[i]=scanner.nextInt();
        }
    }

    public void printArrayElements(int [] array){


        for(int i=0; i<array.length; i++){
            System.out.println(i);
        }


    }

    public void resizeArray(){

        int []original= baseData;

        original=new int[12];

        for(int i=0; i<baseData.length;i++){

            baseData[i]=original[i];




        }
    }




}
