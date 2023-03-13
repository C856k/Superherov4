package com.example.superhero_v4;

import com.example.superhero_v4.model.Superhelt;
import com.example.superhero_v4.repositories.SuperheltRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class SuperheroV4Application {

    public static void main(String[] args) {
        SpringApplication.run(SuperheroV4Application.class, args);

    }

}
