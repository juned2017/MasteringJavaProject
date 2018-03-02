package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {


        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.61);
        album.addSong("Love don't mean a thing", 5.63);
        album.addSong("Holy man", 3.10);
        album.addSong("Lady double dealer", 3.68);
        album.addSong("You can't do it right", 5.25);
        album.addSong("High ball shooter", 4.18);
        album.addSong("The gypsy", 4.46);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album("For those aobut to rock", "AC/DC");
        album.addSong("For those about to rock", 2.66);
        album.addSong("I put the finger on you", 4.67);
        album.addSong("Lets go", 5.18);
        album.addSong("Inject the venom", 6.69);
        album.addSong("Snowballed", 2.24);
        album.addSong("Evil walks", 4.17);
        album.addSong("C.O.D.", 5.48);
        album.addSong("Night of the long knives", 2.13);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("You do it right", playList);

        albums.get(1).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(6, playList);

        // write your code here

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();//we attach listiterator to our playlist
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;

        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());

                    } else {
                        System.out.println("We have reached the end of the playlist");
                        goingForward = false;
                    }
                    break;


                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are at the start of the playlist");
                        goingForward = true;
                    }
                    break;


                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward=false;
                            //we had to go backward to replay this song
                        } else {
                            System.out.println("We are at the start of the list");
                        }

                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward=true; //we had to go forward to reply the song for this case
                        }else {
                            System.out.println(" We have reached the end of the list");
                        }
                    }
                    replaySong();
                    break;


                case 4:
                    printList(playList);
                    break;


                case 5:
                    printMenu();
                    break;


                case 6:
                    //making sure next song plays automatically once we delete current song, so we don't get an error
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+listIterator.next());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous());

                        }
                    }
                    break;
            }
        }

    }


    private static void replaySong() {


    }

    private static void printMenu() {

        System.out.println("Availabe actions: \npress ");
        System.out.println("0 - To quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous songy\n" +
                "3 - replay the current song" +
                "4 -list songs in the playlist" +
                "5- print available option" +
                "6- remove current song from playlist");

    }

    private static void printList(LinkedList<Song> playList) {

        Iterator<Song> iterator = playList.iterator(); //we don't need listiterator b/c we're trying to go forward and backward

        System.out.println("==================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==================");


    }


}
