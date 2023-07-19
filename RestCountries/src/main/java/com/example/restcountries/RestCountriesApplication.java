package com.example.restcountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestCountriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestCountriesApplication.class, args);
    }
}