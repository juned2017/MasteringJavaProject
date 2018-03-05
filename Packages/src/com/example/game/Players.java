package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Players(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {// return a list of string
        List<String>values=new ArrayList<>(); //in order to retrun that list of string, i need to save it somewhere first, so in this case, it's in (values) and i return at the end
        values.add(0,this.name); // i know i can use .add to add specific thins in indexes, so here, i'm adding in index 0, the (name)element and so on
        values.add(1+ "" + this.hitPoints); //("") adding it as a String
        values.add(2+ ""+ this.strength);
        values.add(3,this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if(savedValues!=null && savedValues.size()>0){ //making sure the saved values are not null and have 1 entry at least
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));//changing the string to int b/c above we saved it as a string from the user input
            this.strength=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);

        }

    }
}
