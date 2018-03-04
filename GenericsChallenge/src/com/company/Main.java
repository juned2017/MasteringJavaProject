package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        League<Team<FootBallPlayer>>footballLeague=new League<>("AFL");

        Team<FootBallPlayer>adelineCrow=new Team<>("adelineCrow");
        Team<FootBallPlayer>melbourne=new Team<>("melbourne");
        Team<FootBallPlayer>hawthrone=new Team<>("hawthrone");

        footballLeague.add(adelineCrow);
        footballLeague.add(melbourne);
        footballLeague.add(hawthrone);

        hawthrone.matchResult(adelineCrow,2,0);
        hawthrone.matchResult(melbourne,1,3);

        League<Team<BaseballPlayer>>baseballLeague=new League<>("BaseballLeage");

        Team<BaseballPlayer>chicagoCubs=new Team<>("Chicago Cubs");
        Team<BaseballPlayer>newYorkNetz=new Team<>("New York Nets");
        Team<BaseballPlayer>detroitTigers=new Team<>("Detroit Tigers");

        baseballLeague.add(chicagoCubs);
        baseballLeague.add(newYorkNetz);
        baseballLeague.add(detroitTigers);

        footballLeague.showLeagueTable();


    }
}
