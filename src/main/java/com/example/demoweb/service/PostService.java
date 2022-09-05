package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        return Arrays.asList(
                new Post("Eva", 123),
                new Post("Ann", 456),
                new Post("Nadya", 789)
        );
    }
}
