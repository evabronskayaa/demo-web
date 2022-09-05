package com.example.demoweb.model;

import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(String text, Date date, Integer likes){
        this.text = text;
        this.creationDate = date;
        this.likes = likes;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

}
