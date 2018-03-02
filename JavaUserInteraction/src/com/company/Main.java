package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean hasWon=false;

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        // write your code here

        System.out.println("Enter your address: ");
        Scanner scanner2 = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        System.out.println("Your grade is: " + grade);


        int randomNumber=(int)(Math.random()*100)+1;

        System.out.println("Pick a number" );

        Scanner scanner3=new Scanner(System.in);



        for(int i=10; i>0; i--){

            int guess=scanner3.nextInt();
            if(randomNumber<guess){
                System.out.println("lower");
            }
            if(randomNumber>guess){
                System.out.println("higer");
            }
            if(randomNumber==guess){
                System.out.println("random number is "+ randomNumber);
                hasWon=true;
                break;
            }


        }
        if(hasWon){
            System.out.println("good job");
        }else {
            System.out.println("you loose, random number was" +randomNumber);
        }






    }
}
