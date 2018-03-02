package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    private ArrayList<Song> songs=new ArrayList(); //have a list of songs

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs=new ArrayList<>(); //have the songs list initalized so i can add
        //song after giving album a name , and artist
    }

    public boolean addSong(String title, double duration){ //add a song by providing a title and duration

        if(findSong(title)==null){ //validation to see if song title exist already
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }


    private Song findSong(String title){//validation
        for(Song checkedSong: this.songs){ //equvalent to for loop iteration
            if (checkedSong.getSongTite().equals(title)) { //loop through the list of song, and get their title, if the
                //checkedSong title equals tittle passed in, return the checkdedSong
                return checkedSong;
            }

        }
        return null;

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song>playList){
        int index=trackNumber-1; //e.g 0-1=1 start at song 1 b/c array starts from 0
        if((index>0)&&(index<this.songs.size())){ //checking if song is in that entry

            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+ trackNumber);
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song>playList){
        Song checkedSong=findSong(title);

        if(checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title + " is not in this album");
        return false;

    }

}