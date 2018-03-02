package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ContactManager myContactManger=new ContactManager();

        Contact friendJuned=new Contact();
        friendJuned.name="Juned Ahmed";
        friendJuned.email="juned.ahmed10@gmail.com";

        Contact frindTwo=new Contact();
        frindTwo.name="Wasi Ahmed";
        frindTwo.email="wasi10@gmail.com";

        myContactManger.addContact(friendJuned);
        myContactManger.addContact(frindTwo);

        Contact result=myContactManger.searchContact("Juned Ahmed");
        System.out.println(result.email);

    }
}
