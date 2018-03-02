package com.company;

public class Button {
    private String title;
    private OnClickListener onClickListener; // variable of interface OnClickListener made here

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener=onClickListener;
    }

    //button will sit on click listen
    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title); //a method that takes a string type as a parameter

    }
}
