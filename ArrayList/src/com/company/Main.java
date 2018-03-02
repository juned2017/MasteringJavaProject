package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        ArrayList namesOfPeople=new ArrayList();

        namesOfPeople.add("Juned");
        namesOfPeople.add("ahmed");

        for(int i=0; i<namesOfPeople.size(); i++){
            if(namesOfPeople.get(i).equals("Juned")){

                System.out.println(namesOfPeople.get(i));
            }
           System.out.println(namesOfPeople.indexOf(i));


        }

//        ArrayList names=new ArrayList();
//
//        names.add("Juned");
//        names.add("Ahmed");
//        names.add(2,"Hello");
//        names.add("bushra");
//        names.add("wasi");
//
//        int size=names.size();
//
//        System.out.println(size);
//
//        for(int i=0; i<names.size(); i++){
//            System.out.println(names.get(i));
//        }







//        System.out.println(names);


//        There's another type of loop that's basically a shorthand for loops
// that doesn't require you to specify a loop counter variable nor an index variable.
//
//        It consists of 2 parts, declaring the item variable followed by a colon : then the ArrayList variable (or any collection type):


	// write your code here
    }
}
