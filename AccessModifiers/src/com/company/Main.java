package com.company;

//only Classes , interfaces and enums can exist at the top level, everything else must be included within one of these.

//Package-private : the object is only avaialbe wihtin its own package (and is visible to every class within the same package)

//package-private is specified by not speciign, ie it is the default if you do no specify public.
// example: class PackagePrivate, interface PackagePrivateInterface.

//Member level: at the member level (when you are inside the class), public has the same meaning as the at the top level. a public class member (or field) and public mehtod can be accesed from
//any other class anywhere, even in a diffrent package

//Private; only visilbe in the class it's declared in , not even in it's subclass

//Protected; visible anywhere in it's own package , also in subclass even if it's in another package
public class Main {

    public static void main(String[] args) {
	// write your code here

        Account juned=new Account("Juned");
        Account wasi=new Account("Wasi");

        wasi.deposit(30);
        wasi.withdraw(10);
        wasi.calculateBalance();

        System.out.println("\n ***************************************************");
        juned.deposit(230);
        juned.withdraw(30);
        juned.calculateBalance();


    }
}
