package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "SpringBoot .WAR file - CosmosDB with MongoDB API";

    @GetMapping("/")
    public String home() {
        return message;
    }
}
