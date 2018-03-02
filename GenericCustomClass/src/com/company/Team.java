package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{ //(T) indicating a type paramter will be pass, type will be known when we instantiate this class during run time
    //if you had it without (extends Player) your code wuld still work but then users would be able to add anytype of object in the <> argument, like String class. but
    //since we put (extends Player) we're basically saying that we're only accepting data type that extended the Player class, in terms inheriting Player class
    //no we're saying we are only accepting data type that extended (Player) class,(T extends Player) this is a upper bound type, which means, we can't pass in random data type,
    //it has to be of type Player
    //

    private String name;
    int played=0;
    int won=0;
    int lost=0;
    int tied=0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private ArrayList<T>members=new ArrayList<>(); //by making this generic here , we can use the variable (members) to reference objects of all three sports class

//    public boolean addAnotherPlayer(T player){
//        if(members.contains(player)){
//            //player already exist
//            System.out.println("Player already exist "+player.getName());
//            return false;
//        }else {
//            members.add(player);
//            return true;
//        }
//
//    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName());
//            System.out.println(((Player)player).getName()+ " is already on the team"); //we're casting it to (Player) b/c our ArrayList is generic type T
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName()+ " picked for team "+ this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void compareREsult(Team<T>oponent,int ourScore, int theirScore){

    }


    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore>theirScore){
            won++;
            message=" won against ";

        }else if(ourScore==theirScore){
            tied++;
            message=" tied ";

        }else {
            lost++;
            message="lost to ";
        }
        played++;
        if(opponent!=null){
            System.out.println(this.getName()+ message+ opponent.getName());
            opponent.matchResult(null,ourScore,theirScore); //if we don't put null in opponent, then it will be fall into an infinite loop and cal (matchResult) again n again
        }

    }

    public int ranking(){
        return ((won*2)+tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){ //(this.ranking) is the current team ranking that is saved in this class
            return -1; //this current data for the particular theam is higner so return -1
        }else if(this.ranking()<team.ranking()){
            return 1;
        }else{
            return 0;
        }
    }
}
