package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;


                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchIteam();
                    break;

                case 6:
                    quit = true;
                    break;

            }

        }


    }

    private static void searchIteam() {

        System.out.print("Enter an item to searchJ: ");

        String item = scanner.nextLine();

        if (groceryList.onFile(item)) {
            System.out.println("Found" + item + " in our grocery list");
        } else {
            System.out.println(item + " is not in the shooping list");
        }


    }

    private static void removeItem() {
        System.out.print("Enter item name you want to remove:  ");
        String itemName = scanner.nextLine();
        scanner.nextLine();

        groceryList.removeGroceryItem(itemName);


    }

    private static void modifyItem() {

        System.out.print("Current item name: ");
        String itemNumber = scanner.nextLine();

        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);

    }

    private static void addItem() {

        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());


    }


    public static void printInstructions() {

        System.out.println("\n Press ");
        System.out.println("\t 0-To print choice options.");
        System.out.println("\t 1-To print the list of grocery items.");
        System.out.println("\t 2-To add an item to the list.");
        System.out.println("\t 3-To modify an item in the list.");
        System.out.println("\t 4-To remove an item from the list");
        System.out.println("\t 5-To search for an item in the list");
        System.out.println("\t 6-To quit the application");


    }
    //to copy one array into another
    public static void processArrayList(){
        ArrayList<String>newArray=new ArrayList<>();
        //adding entire content to new array
        newArray.addAll(groceryList.getGroceryList());

        //or at the point of initalizing an object
        ArrayList<String>secondArray=new ArrayList<>(groceryList.getGroceryList());

        //changing arraylist to regular array

        String[] myArray=new String[groceryList.getGroceryList().size()];//initalizing correct size
        myArray=groceryList.getGroceryList().toArray(myArray);

    }
}


//groceryList.addGroceryItem("apple");
//groceryList.addGroceryItem("grape");
//groceryList.addGroceryItem("banana");


//
//groceryList.printGroceryList();
//
//String itemFound=groceryList.findItem("grape");
//System.out.println("item found "+ itemFound );
//groceryList.modifyGroceryItem(1,"cream");
//
//groceryList.removeGroceryItem(2);
