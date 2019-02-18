package com.example.samuray.myapplication;

public class PostModel {
    private String title;
    private String text;


    public PostModel(String title,
                     String text
    ) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {return title;}
    public String getText() {return text;}

}
