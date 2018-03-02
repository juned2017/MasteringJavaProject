package com.company;

public class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    //allocate and initialize stack

    FixedStack (int size){
        stck=new int[size];
        tos=-1;

    }

    @Override
    public void push(int item) {
        if(tos==stck.length)
            //use length number
            System.out.println("stack is full");
else stck[++tos]=item;


    }

    @Override
    public int pop() {
        if(tos<0){
            System.out.println("stack underlflow");
            return 0;

        }else {
            return stck[tos--];
        }
    }





}
