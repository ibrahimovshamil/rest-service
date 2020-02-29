package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("agri")
public class AgriUserController {

    @Autowired
    AgriUserRepo agriUserRepo;

    @GetMapping("")
    public List<AgriUser> getAgriUsers(){
        return agriUserRepo.findAll();
    }

    @PostMapping("")
    public AgriUser addTrackToAlbum(@RequestBody AgriUser t){
        agriUserRepo.save(t);
        return t;
    }
}
