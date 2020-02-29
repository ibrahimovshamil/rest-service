package com.example.restservice.controllers;


import com.example.restservice.entities.Post;
import com.example.restservice.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("posts") // ********
public class PostController {


//    @GetMapping("{id1}")
//    public List<Post> getAgriProductPosts(@PathVariable("id") int id, @PathVariable("id1") int id1, @PathVariable("id2") int id2 ){
//        Product p = productRepo.getOne(id1);
//        return p.getPosts();
//    }
}
