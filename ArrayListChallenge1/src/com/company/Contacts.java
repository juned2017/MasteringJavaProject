package com.company;

public class Contacts {

    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public Contacts(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //factory method, allows us to create a Contacts without needing to create an object reference
    public static Contacts createContact(String name, String phoneNumber){
        return new Contacts (name,phoneNumber);

    }
    public static Contacts addPhoneNumberOnly(String phoneNumber){

        return new Contacts(phoneNumber);

    }

    public static Contacts setName(String name) {
        return new Contacts (name);
    }

    public static Contacts setPhoneNumber(String phoneNumber) {
        return new Contacts(phoneNumber);
    }

    public String getName() {
        return name;
    }
}
