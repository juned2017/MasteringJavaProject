package com.company;

public class Main {

    public static void main(String[] args) {

//create a simple banking application
        //there should be a bank class
        //it should have an arraylist of branches
        //each branches should have an arraylist of Customers
        //Customer class should have an arraylist of Doubles(tansactions)
        //Customer:
        //Name, and the ArrayList of doubles.
        //Branch:
        //Need to be able to add a new customer and initial transaction amount.
        //Also needs to add additional transactions for that customer/branch
        //Bank:
        //add a new branch
        //add a customer to that branch with initial transaction
        //add a transaction for an existing customer for that branch
        //show a list of customers for a particular branch and potionally a lit of thier transactions
        //demonstration autoboxing and unboxing in your code
        //Hint: transactions
        //add data validation .
        //e.g. check if exists, or does not exist, et.
        //think about where you are adding the codee to perform certain actions

        Bank bank=new Bank("National Detroit Bank");

        bank.addBranch("Pnc");
        bank.addCustomer("Pnc","Juned",12.50);
        bank.addCustomer("Pnc","Bushra",40.3);
        bank.addCustomer("Pnc","Wasi",40.55);

        bank.addBranch("Chase");
        bank.addCustomer("Chase","Tim",34.99);

        bank.addCustomerTransaction("Pnc","Juned",34.10);
        bank.addCustomerTransaction("Chase","Tim",49.23);

        bank.listCustomer("Chase",true);



    }








}
