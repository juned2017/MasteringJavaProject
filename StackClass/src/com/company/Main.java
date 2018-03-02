package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {


//    The Stack class includes these five methods:
//
//    push(E item): Adds an item onto the top of this stack
//    pop(): Removes the object at the top of this stack and returns that object
//    peek(): Returns the object at the top without removing it from the stack.
//    empty(): Checks if this stack is empty.
//            search(Object o): Searches for an object in this stack and returns its position.
//    Just like the ArrayList, the Stack also internally uses an array that stores everything in order.
//
//    An example of when a stack is useful would be when developing
//    something like an email system: Once the email server receives a new email it should
//    add this email to the top of the stack of emails so that the user will read the latest email first!


//    You might be wondering why the need to cast the return type of pop() and peek() using (String)?
//
//    That's because these methods actually return the type Object and not String, simply because
//    it has no idea what you've inserted and what type it is!

            // write your code here


            Stack newsFeed=new Stack();
            newsFeed.push("Morning news");
            newsFeed.push("Afternoons");
            newsFeed.push("Evening news");

            String breakingNews=(String)newsFeed.pop();

            System.out.println(breakingNews);

            String moreNews =  (String) newsFeed.pop();
            System.out.println(moreNews);

            String news=(String)newsFeed.peek();
            System.out.println(news);
	// write your code here
    }
}
