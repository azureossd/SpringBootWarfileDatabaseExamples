package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import java.util.List;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;
import com.cosmosdbdatabaseexample.springbootwarfile.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCityController {
    @Autowired
    private CityRepository cityRepository;

    // This needs to be changed to a POST mapping - this is a placeholder
    @GetMapping("/api/cosmosdb/city/add")
    public List<CityEntity> cities() {
        return cityRepository.findAll();
    }
}
