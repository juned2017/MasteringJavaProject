package com.company;

import com.sun.xml.internal.rngom.parse.host.Base;

public class Main {

    public static void main(String[] args) {
        // write your code here

        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootBallPlayer> steeler = new Team<>("Steelers");
        Team<FootBallPlayer> patriots = new Team<>("Patriots");


        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        Team<BaseballPlayer> newYorkJetz = new Team<>("New Work Jetz");


        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");

        adelaideCrows.addPlayer(joe);
        chicagoCubs.addPlayer(pat);
        soccerTeam.addPlayer(beckham);

        adelaideCrows.matchResult(steeler, 4, 5);
        adelaideCrows.matchResult(patriots, 2, 0);


        chicagoCubs.matchResult(newYorkJetz, 4, 5);

//        System.out.println("Games won by "+adelaideCrows.getName() +adelaideCrows.won+" and game lost is "+ " "+adelaideCrows.lost);



        System.out.println("Ranking for Football Teams");
        System.out.println(adelaideCrows.getName() + " " + adelaideCrows.ranking());
        System.out.println(chicagoCubs.getName() + " " + chicagoCubs.ranking());
        System.out.println("\n");

        System.out.println("Ranking for Baseball Teams");
        System.out.println(newYorkJetz.getName() + " " + newYorkJetz.ranking());

        System.out.println(patriots.compareTo(steeler));
    }
}
