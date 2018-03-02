package com.company;

public class ContactManager {
    Contact [] myFriends;
    int friendsCount;

    ContactManager(){
        this.friendsCount=0;
        this.myFriends=new Contact[500];

    }
    void addContact(Contact contactObject){
        myFriends[friendsCount]=contactObject;
        friendsCount++;
    }

    Contact searchContact(String searchName){
        for (int i=0;i<friendsCount;i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}
