package com.company;

//idea of interface is to create abstract method that the class that implement the interface will define
//common behvious that other multiple classes can use
public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone; //u can define the type as interface but u can't create an object using new, u can write as Deskphone timsphone as well
        timsPhone=new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();


        timsPhone=new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
