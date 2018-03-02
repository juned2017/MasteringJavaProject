package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



        MyLinkedList list=new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData="5 7 3 9 8 2 1 0 4 6 8 9";

        String[]data=stringData.split(" ");
        for (String s: data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
    }
}
