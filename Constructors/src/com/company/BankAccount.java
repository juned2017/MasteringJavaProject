package com.company;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public BankAccount (){

        //special use of the keyword this, where we call another constructor from within to set some default value at
        //object creation if values are not provided
        //calling the second second constructor


        this("123",32,"defaul Name","default eail","defaul phoneNumber");

    }

    public BankAccount (String number, double balance,String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailAddress=customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;

    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("123",1055,customerName,customerEmailAddress,customerPhoneNumber);
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }



    public void deposit(double depositAmount){
        this.balance +=depositAmount;
        System.out.println("you have deposited "+ this.balance + "in you account");
    }
    public void withdrawl(double withdrawlAmount){
        if(balance-withdrawlAmount<0){
            System.out.println("you do not have enough money, your current balnce available is "+ balance);
        }else {
            this.balance-=withdrawlAmount;
            System.out.println("Withdrawl of "+ withdrawlAmount + "was processed");
        }
    }



}
