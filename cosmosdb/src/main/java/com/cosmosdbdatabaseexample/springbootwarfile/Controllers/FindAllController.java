package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import java.util.List;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;
import com.cosmosdbdatabaseexample.springbootwarfile.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindAllController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/api/cosmosdb/city/find")
    public List<CityEntity> cities() {
        return cityRepository.findAll();
    }
}
