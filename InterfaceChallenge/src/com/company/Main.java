package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Players juned=new Players("Juned",10,15);
System.out.println(juned);
//saveObject(juned);
//
juned.setHitPoints(8);
System.out.println(juned);
//
//juned.setWeapon("flower");
//loadObject(juned);
//System.out.println(juned);
//
//
ISaveable ghost=new Monster("pickachu",1,5);

//ghost.getName    >>>>>>>>>we cant do that but we can do something like the below code
        System.out.println("Strength = " + ((Monster) ghost).getStrength());
        System.out.println(((Monster) ghost).getName());//you're here just using casting (basically saying ghost is the type Monster)





//System.out.println(ghost);
//saveObject(ghost);
//loadObject(ghost);
System.out.println(ghost);




    }
    public static List<String> readValues(){ //we want to retrun a list of String
        List<String>values=new ArrayList<>();//we have a generic list that is of String, and we initianlize a specific list type (ArrayList)

        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        int index=0; //just to rerun the codee back from this location again...
        System.out.println("Choose \n"+ "1 To enter a string \n"+ "0 To quit");

        while (!quit){ //condition

            System.out.println("Choose an option: ");
            int choice=scanner.nextInt(); //integer saved in choice
            scanner.nextLine(); //going to next line
            switch (choice){
                case 0:
                    quit=true;
                    break;


                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput=scanner.nextLine();//whatever is typed in next line, put it in stringInput,
                    values.add(stringInput);//add stringInput to the values list
                    index++; //this is needed to go back when you enter 0, so your code can start from the top again, it's kind of like giving it a location to go
                    // back to, otherwise you will get a indexoutofBoundexception
                    break;
            }
        }

return values;
    }

public static void saveObject(ISaveable objectToSave){ //and class that implemented the interface, we can have access to object of that class through the use of interface variable
        for (int i=0; i<objectToSave.write().size(); i++){

            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");

        }
}

public static void loadObject(ISaveable objectToLoad){ //handy method to use after you get user inputs when the (read) method is used
    List<String>values=readValues();
    objectToLoad.read(values);
}
}
