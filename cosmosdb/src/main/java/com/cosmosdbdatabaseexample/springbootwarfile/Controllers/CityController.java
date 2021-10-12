package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {
    @GetMapping("/cities")
    public String cities() {
        return "test";
    }
}
