package com.company;

import java.util.ArrayList;

public class Customers {
    private ArrayList<Double> transactions;

    private String name;


    public Customers(double initialAmount, String name) {

        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
        this.name = name;
    }

    public void addTransaction(double amount){
        //primitive to an object wrapper
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
