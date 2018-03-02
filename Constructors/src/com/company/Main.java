package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        BankAccount bobsAccount=new BankAccount("12345",0.00,"juned ahmed","juned@gmailo.com","313231");
        BankAccount secondAccount=new BankAccount();
        BankAccount newAccount=new BankAccount("Jun","ju@yahoo.com","1243535");
        System.out.println(newAccount.getCustomerName()+ "" + newAccount.getNumber());
        System.out.println(secondAccount.getCustomerEmailAddress());

        System.out.println(bobsAccount.getBalance());
        System.out.println(bobsAccount.getCustomerEmailAddress());

//        bobsAccount.setBalance(100);

        bobsAccount.deposit(50.0);




    }
}
