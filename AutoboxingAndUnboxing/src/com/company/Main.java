package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String>stringArrayList=new ArrayList<>();
        stringArrayList.add("juned");

        //but you can create a int class and use that to pass data
        // one of doing it is this
//        ArrayList<IntClass>myInteger=new ArrayList<IntClass>();
//        myInteger.add(new IntClass(4));
//        myInteger.add(new IntClass(50));
//
//        for(int i=0; i<=myInteger.size(); i++){
//
//            System.out.println(i+ " ----->"+myInteger.get(i).getIntegers());
//
//        }

        //Better way of doing it is this
        ArrayList<Integer>myArrayList=new ArrayList<Integer>();
                for(int i=0; i<=10; i++){
                    myArrayList.add(Integer.valueOf(i)); //autoboxing wrapping the int value to Integer class tyoe
        }

        for(int i=0; i<=10; i++){
            System.out.println(i +"----->" + myArrayList.get(i).intValue());//unboxing //converting it back  into an int from the object wrapper
        }



    }
}
