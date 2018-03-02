package com.company;

public abstract class ListItem { //root

    protected ListItem rightLink=null;   //references to object of list items or a node reference
    protected ListItem leftLink=null;    //each will hold reference to the specific list LinkedList item


protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next(); //returnt reference to next item on the list
    abstract ListItem setNext(ListItem item);//set the reference to the next item in the list to refer to
    abstract ListItem previous(); //opposite of next
    abstract ListItem setPrevious(ListItem item);


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract int compareTo(ListItem item); //compare the object passed in, returns 0 if they are equal , and a number if the item paramter should sort before the object,otherwise returns a positive number
}
