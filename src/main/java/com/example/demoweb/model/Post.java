package com.example.demoweb.model;

import java.util.List;

public class Post {
    private String text;
    private Integer likes;

    public Post(String text, Integer likes){
        this.text = text;
        this.likes = likes;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }


}
