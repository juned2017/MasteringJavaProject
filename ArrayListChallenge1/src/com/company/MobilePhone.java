package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    //
    public MobilePhone() {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }


//think about when you add a new contact, do you want to check the system first to seee if that person exist or not
    //if contact does exist , return a message, else add the contact to the array list

    public boolean addNewContact(Contacts contacts) { //passs a contact object
        if (findContact(contacts.getName()) >= 0) {// check to see if that conatct exist by using the contacts variable.getName, if
            //it is greater than or equal to 0, that means that item has been added already.
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contacts); //add the element passed in to the Contact arraylist created above
        return true;

    }


    //updating contact: i want to pass the oldcontact name and new contact
    //find where the old contact is, and give a message if old contact was not found,
    //if found, then replace it with new contact

    public boolean updateContact(Contacts oldContact, Contacts newContact) { // pass old contact, and new contact
        int foundPosition = findContact(oldContact); // get the postion of the old contact
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact); // pass in the postion for old contact and new contact to replace it with
        System.out.println(oldContact.getName() + ", was replaced with" + newContact.getName());
        return true;
    }

    //if i find the contact in muy array list, then remove it
    public boolean removeContact(Contacts contacts) {
        int foundPostion = findContact(contacts);
        if (foundPostion < 0) {
            System.out.println(contacts.getName() + ", was not found.");
            return false;

        }
        this.myContacts.remove(foundPostion);//remove it from my contact list
        System.out.println(contacts.getName() + ", was deleted from the contacts list.");
        return true;
    }

    //i will pass a contact object as parameter, and return the postion
    private int findContact(Contacts contacts) {
        return this.myContacts.indexOf(contacts);
    }

    //i iwll pass a contact name, and loop thrugh my array list,
    //get the saved element at that index postion, and if it equals contactname,
    //then retun it to caller

    private int findContact(String contactName) { //pass in a string contact name
        for (int i = 0; i < this.myContacts.size(); i++) { // loop throught the size fo the arraylist
            Contacts contact = this.myContacts.get(i); //get the specified postion of the element in the list
            if (contact.getName().equals(contactName)) { // compare the element that was return and see if it is the same as the
                //name passed in
                return i; //return that element
            }
        }
        return -1;
    }



//i'm getting the postiong returned as a interger
    private int findContactByNumber(String phoneNumber){ //pass in the contacrt phone numbers as string
        for(int i=0; i<=this.myContacts.size(); i++){//loop thorugh the arraylist
            Contacts contacts=this.myContacts.get(i); //save the postion in an Contact object

            if(contacts.getPhoneNumber().equals(phoneNumber)){ //use that to see if phone number exist
                return i;
            }
        }
        return -1;
    }


    //returns a Contact
    public Contacts whoIsThisContact(String phoneNumber){
        int positiong =findContactByNumber(phoneNumber); // position is being found by findContactbyNumber method

        if(positiong>=0){
            return this.myContacts.get(positiong);
        }
        else {
            System.out.println("does not have a name");
        }

        return null;
    }




    //i will pass a Contact, and if findcontact return greater than 0, return the name to caller, else nothing
    public String queryContact(Contacts contacts) {
        if (findContact(contacts) >= 0) {
            return contacts.getName();

        }
        return null;


    }

    //i can also just pass the name of contact, and return the element
    public Contacts queryContact(String name) {
        int position = findContact(name); //find the postion

        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List ");

        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + this.myContacts.get(i).getName() + " ->" +
                    this.myContacts.get(i).getPhoneNumber());
        }

    }

    public boolean duplicateContacts(Contacts contacts, Contacts phoneNumber) {
        int position = findContact(contacts);

        if (position <= 0) {
            myContacts.add(contacts);
            myContacts.add(phoneNumber);
            return true;
        } else {
            System.out.println("This is a new Contact " + contacts + " and does not exist");
            return false;
        }
    }


    public boolean addPhoneNumber(String name, Contacts newPhoneNumber) {

        int position=findContact(name);

       if(position>=0){
           myContacts.add(position,newPhoneNumber);
       }


        return false;
    }
}
