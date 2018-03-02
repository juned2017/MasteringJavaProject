package com.company;

public interface NodeList {
    //any data strucutre that we create should have stating root
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root); //we will use this to start at the root and print out the value


}
