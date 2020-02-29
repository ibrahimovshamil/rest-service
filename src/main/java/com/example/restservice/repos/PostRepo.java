package com.example.restservice.repos;

import com.example.restservice.entities.AgriUser;
import com.example.restservice.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
