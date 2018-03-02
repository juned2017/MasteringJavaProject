package com.company;

public class EnhancedPlayer {
    private String name;
    private int health =100;
    private String weapon;


    public EnhancedPlayer(String name, int health, String weapon) {

        this.name = name;
        this.health = health;
        this.weapon = weapon;


    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public void looseHealth(int damage){

        this.health=this.health-damage;

        if(this.health<=0){
            System.out.println("no more health left");

        }

    }





}
