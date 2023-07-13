package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    String xxxx = "test Shouold be not allowed to hardcode";

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
