package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer person1=new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2=new VipCustomer("Juned",500);
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());



    }
}
