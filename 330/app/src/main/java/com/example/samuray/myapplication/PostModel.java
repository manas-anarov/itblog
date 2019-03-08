package com.example.samuray.myapplication;

public class PostModel {
    private Integer id;
    private String title;
    private String text;


    public PostModel(Integer id,
                     String title,
                     String text
    ) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public Integer getId() {return id;}
    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }

}
