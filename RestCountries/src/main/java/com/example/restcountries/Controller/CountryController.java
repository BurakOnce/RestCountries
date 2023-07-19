package com.example.restcountries.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Scanner;

@RestController
public class CountryController {

    @GetMapping("/")
    public String CountryCon() {

        Scanner reader = new Scanner(System.in);

            System.out.print("Pick 1 language and I will show you which countries use of this language: ");
            String country = reader.nextLine().toUpperCase();

            try{
            // Use restTemplate for data in API
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://restcountries.com/v3.1/lang/" + country;

            //Data
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

            System.out.println(response.getBody());

            //API answer
            return response.getBody();
            }catch (Exception e){
                System.out.println("Not Found this Language");
                return "Not Found this Language";
            }
    }
}
