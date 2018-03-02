package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();


    public static void main(String[] args) {

        boolean quit = false;

        startPhone();
        printInstructions();

        while (!quit) {
            System.out.println("\nEnter action: 6 to show available options");

            int action = 0;

            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;


                case 3:
                    updateContact();
                    break;


                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;


                case 6:
                    printInstructions();
                    break;


                case 7:addNewContactPhoneNumberOnly();
                    break;


                case 8:

                case 9:
                    whoDoesThisNumberBelongTo();

            }


            // write your code here
        }
    }

//    private static void addContactNameOnly() {
//
//        System.out.println("Enter Contact Name: ");
//        String name= scanner.nextLine();
//
//        Contacts contacts=mobilePhone.queryContact(name);
//
//
//
//        Contacts newName=mobilePhone.addContactNameOnly(contacts);
//        System.out.println("name added is "+name);
//
//    }

    private static void whoDoesThisNumberBelongTo() {

        System.out.println("Type in the phone number of the Cotact name you're searching for");
       String phoneNumber=scanner.nextLine();


       Contacts number=mobilePhone.whoIsThisContact(phoneNumber);
       System.out.println("the number belong to "+number.getName());


    }





    private static void queryContact() {


        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);// look up existing contact from Contact class

        if (existingContactRecord == null) { //if existingcontactrecord is null, print message
            System.out.println("Contact not found.");
            return;


        }
        System.out.println("Name: " + existingContactRecord.getName() + "phone number is" + existingContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existingContactRecord)) { //
            System.out.println("Successfully deleted");

        } else {
            System.out.println("Error deleting contact");
        }


    }

    private static void removeContact() {

        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;


        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");

        } else {
            System.out.println("Error deleting contact");
        }

    }


    private static void updateContact() {

        //getting old contact name to replace

        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);// search for old contact
        //old contact

        if (existingContactRecord == null) { //if that person does not exist
            System.out.println("Contact not found.");
            return;

        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber); // use the createContact method
        //to pass in name, phone number

        if (mobilePhone.updateContact(existingContactRecord, newContact)) { //double checking and the method
            //is adding the new contact to the array list
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");

        }


    }


       private static void addNewContact() {
        System.out.println("Enter new contact new name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, phoneNumber); // in order to create contact, use constru
           //constructor/method  to pass in name and phone number user type in
        if (mobilePhone.addNewContact(newContact)) { //use mobilephone class reference to use .addNewcontact method
            //which takes a Contact object/element as a parameter
            System.out.println(" New contact added name= " + name + ". phone " + phoneNumber);

        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }



    //add a number for a contact who already exist and only have name in the system
    private static void addNewContactPhoneNumberOnly(){

        System.out.println("Enter a new phone number: ");
        String phoneNumber=scanner.nextLine();

        System.out.println("Enter the contact name: ");

        String name=scanner.nextLine();



        Contacts newPhoneNumber=Contacts.setPhoneNumber(phoneNumber);

        if(mobilePhone.addPhoneNumber(name, newPhoneNumber)){
            System.out.println("the new phone number "+ newPhoneNumber + " has been added to the Mobile Phone");
        }else{
            System.out.println("the phone number "+ newPhoneNumber + " cannot be added");
        }

    }

    private static void startPhone() {
        System.out.println("Starting phone ...");

    }


    public static void printInstructions() {

        System.out.println("\n Press ");
        System.out.println("\t 0- To print choice options.");
        System.out.println("\t 1- To print the list of contacts.");
        System.out.println("\t 2- To add a contact to the list.");
        System.out.println("\t 3- To update existing contact.");
        System.out.println("\t 4- To remove a contact from the list");
        System.out.println("\t 5- To search for a contact in the list");
        System.out.println("\t 6- To quit the application");
        System.out.println("\t 7- To add new contact phone number only");
        System.out.println("\t 8- To add add contact name only");
        System.out.println("\t 9- who does this number belong to");


    }

}
