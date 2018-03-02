package com.company;

public class Bed {

private String style;
private int pillows;
private int height;
private int sheet;

    public Bed(String style, int pillows, int height, int sheet) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheet = sheet;
    }


    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheet() {
        return sheet;
    }

    public void make(){
        System.out.println("we're in the bedclass making bed");
    }
}
