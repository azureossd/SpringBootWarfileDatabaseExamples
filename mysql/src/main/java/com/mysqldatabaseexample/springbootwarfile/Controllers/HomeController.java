package com.mysqldatabaseexample.springbootwarfile.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "SpringBoot Warfile - MySQL example.";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
