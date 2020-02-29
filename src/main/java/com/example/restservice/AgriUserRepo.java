package com.example.restservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgriUserRepo extends JpaRepository<AgriUser, Integer> {
}
