package com.company;

class Movie {
    private String name;


    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot here";
    }

    public String getName() {
        return name;
    }
}



class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }

}


class IndependanceDay extends Movie {

    public IndependanceDay() {
        super("Independance day");
    }

    @Override
    public String plot() {
        return "aliens taking over the world";
    }
}




class Mazerunner extends Movie {

    public Mazerunner() {
        super("mazerunner");
    }

    @Override
    public String plot() {
        return "people tty to escape";
    }
}



class StarWars extends Movie {

    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "imperial forces take over the universe";
    }
}



class Forgetable extends Movie {
    public Forgetable() {
        super("forgetable");
    }
    //no plot method

}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {

            Movie movie = randomMovie();
            System.out.println("Movie #" + i + movie.getName() + "\n" +
            "Plot:"+ movie.plot()+ "\n");


        }


    }
    //using the (Is A relationship) jaws is a movie, independanceday is a movie, starswar is a movie etc ......
    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random() * 5)+1);

        System.out.println("random number generated was " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new Mazerunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();

            default:
                return null;
        }
    }

}





