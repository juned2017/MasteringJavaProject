package com.company;

import java.util.ArrayList;

public class GroceryList {


    //the <E> represent wt types of data b/c arraylist can hold objects
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }



    public void addGroceryItem(String item) {

        groceryList.add(item);


    }

    public void printGroceryList() {

        System.out.println("you have " + " " + groceryList.size() + "items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position=findItem(currentItem);
        if(position>=0){
            modifyGroceryItem(position,newItem);

        }

    }

    private void modifyGroceryItem(int postion, String newItem) {

        groceryList.set(postion, newItem);
        System.out.println("grocery item " + (postion + 1) + "has been modified");
        System.out.println("new item modified to was" + " " + newItem);


    }
    public void removeGroceryItem(String item){
        int position=findItem(item);

        if(position>=0){
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);

//        String theItemRemoved = groceryList.remove(position);


    }

    private int findItem(String searchItem) {
//        boolean exists=groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);

    }
    public boolean onFile(String searchItem){
        int position=findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }


}
