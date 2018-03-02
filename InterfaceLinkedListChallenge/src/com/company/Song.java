package com.company;

public class Song {
    private String songTite;
    private double songDuration;


    public Song(String songTite, double songDuration) {
        this.songTite = songTite;
        this.songDuration = songDuration;
    }

    public String getSongTite() {
        return songTite;
    }

    @Override
    public String toString() {
        return this.songTite+ ": "+this.songDuration;
    }
}
