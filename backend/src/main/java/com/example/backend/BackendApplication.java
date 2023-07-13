package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {
    public void tbd(){
        int x = 3;
        int y = 3;
        if((x - y) == 0){
            System.out.println("XXXXX");
            System.out.println("xxxxx");
        }
    }

    public static void main(String[] args) {

        SpringApplication.run(BackendApplication.class, args);
    }

}
