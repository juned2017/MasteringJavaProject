package com.company;

import java.util.ArrayList;

public class Main {

    //linked list is kind of like arraylist . but here linkedlist point to the next item that it's
    //linked to. so one object can point to the next item in the memory allocation . so say you
    //have (apple, grape, potatoe) that's index (0,1,2). in traditinal arraylist, if you want to
    //add say penuts , after apple, you will have to move everything in the arrayist one down, but
    //with linked list you can add penuts in between apple and grape. and make apple-linked to -penuts-linked
    //grape, which was what apple originally pointed at and the whole list is linked to each other in the memory.

    //if we were to remove grape, then garbage collection will remove that object becuase nothing is pointing
    //to it now


    public static void main(String[] args) {

        Customer customer=new Customer("Juned",43.55);
        Customer anotherCustomer;
        anotherCustomer=customer;
        anotherCustomer.setBalance(12.45);

        System.out.println(" Balance for customer " + customer.getName()+ " is "+ customer.getBalance());


        ArrayList<Integer>intList=new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0;i<intList.size(); i++){

            System.out.println(i +" : "+intList.get(i) );

        }

        intList.add(1,2);
        intList.remove(2);



        for(int i=0;i<intList.size(); i++){

            System.out.println(i +" : "+intList.get(i) );

        }



    }
}
