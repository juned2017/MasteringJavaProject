package com.company;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance=0;
    private ArrayList<Integer>transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions=new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void deposit(int amount ){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(this.accountName+ " Deposited " + amount +" .Balance is now "+this.balance);
        }else{
            System.out.println(" cannot deposit balance below 0");
        }

    }

    public void withdraw(int amount){
       int withdrawl= -amount; //we're setting the amount to be a negative amount here by (-), so withdraw will be a negative number b/c we're trying to
        //subtract that number from our balance.
       if(withdrawl<0){
           this.transactions.add(withdrawl);
           this.balance+=withdrawl;
           System.out.println(this.accountName+ " withdrew " +amount +" .Balance now is "+ this.balance);
       }else{
           System.out.println("cannot withdraw negative sum");
       }
    }

    public void calculateBalance(){
        this.balance=0;
        for (int i: this.transactions){
            this.balance +=i;
        }
        System.out.println(this.accountName+ " calculated balance is "+ this.balance);
    }
}
