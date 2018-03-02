package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Detroit");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");


//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Alice Spring");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {

        //an iterator is another way of going through all the items in an array , or list of things

        Iterator<String> i = linkedList.iterator(); //equivalent of for loop.

        while (i.hasNext()) { // while there is a next item available, do the thing inside
            System.out.println("Now visiting " + i.next());//.next is equivalent to i++
        }
        System.out.println("================");

    }

    private static boolean addInOrder(LinkedList linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); //listIterator gives more flexibility, this
//        does not automatically points to first index in entry, the .next() below is doing that
        while (stringListIterator.hasNext()) {

            int comparison = stringListIterator.next().compareTo(newCity); //returns a number , if number return is 0, that means

            if (comparison == 0) {
                //do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new item should appear before this one
                //Brisbane---> if (Adelaide) was passed in as a parameter
                //we need to move back to compared to previous city b/c above we used .next to move to next number
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;


            } else if (comparison < 0) {
                //move on next city
            }


        }

        stringListIterator.add(newCity);
        return true;


    }

    public static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        //varialbe to track direction of the linkedlist
        boolean goingForward=true;

        ListIterator<String> listIterator = cities.listIterator();//returns index 0

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("now visiting " + listIterator.next());//goes to next element on the list
            printMenu();
        }
        while (!quit) { //quit is not false
            int action = scanner.nextInt();

            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward)//user has previouosly selected of going back
                        if(listIterator.hasNext()){
                        listIterator.next();
                        }
                        goingForward=true;
                    if (listIterator.hasNext()) { //if anyting exist in the list
                        System.out.println("Now visiting " + listIterator.next()); //prints the next elemnet
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward=false;
                    }
                    break;


                case 2:
                    if(goingForward){
                        listIterator.previous();

                    }
                    goingForward=false;

                    if (listIterator.hasPrevious()) {//returns previous element if there is one
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward=true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }


        }
    }

    private static void printMenu() {
        System.out.println("Availabe actions: \npress ");
        System.out.println("0 - To quit\n"+
        "1 - Go to next city\n"+
        "2 - Go to previous city\n"+
        "3 - Print menu options");

    }
}
