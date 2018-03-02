package com.company;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber); //we're writing the signature
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}

