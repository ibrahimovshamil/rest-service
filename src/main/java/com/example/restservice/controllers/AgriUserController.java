package com.example.restservice.controllers;

import com.example.restservice.entities.AgriUser;
import com.example.restservice.entities.Post;
import com.example.restservice.entities.Product;
import com.example.restservice.repos.AgriUserRepo;
import com.example.restservice.repos.PostRepo;
import com.example.restservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agri")
public class AgriUserController {

    @Autowired
    AgriUserRepo agriUserRepo;
    @Autowired
    ProductRepo productRepo;
    @Autowired
    PostRepo postRepo;


    @GetMapping("")
    public List<AgriUser> getAgriUsers(){
        return agriUserRepo.findAll();
    }

    @PostMapping("")
    public AgriUser addAgriUser(@RequestBody AgriUser t){
        agriUserRepo.save(t);
        return t;
    }

    @GetMapping("{/id}")
    public AgriUser getAgriUser(@PathVariable("id") int id){
        return agriUserRepo.getOne(id);
    }

    @GetMapping("{/id}/products")
    public List<Product> getAgriProducts(@PathVariable("id") int id ){
        return agriUserRepo.getOne(id).getProducts(); // check this part
    }

    @GetMapping("{/id}/{id1}/posts")
    public List<Post> getAgriProductPosts(@PathVariable("id") int id, @PathVariable("id1") int id1){
        Product p = productRepo.getOne(id1);
        return p.getPosts();
    }

    @GetMapping("{/id}/{id1}/{id2}")
    public Post getAgriProductPost(@PathVariable("id") int id, @PathVariable("id1") int id1, @PathVariable("id1") int id2){
//        Product p = productRepo.getOne(id1);
        return postRepo.getOne(id2);
    }



}
