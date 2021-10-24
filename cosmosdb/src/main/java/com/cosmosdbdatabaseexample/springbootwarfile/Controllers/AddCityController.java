package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;
import com.cosmosdbdatabaseexample.springbootwarfile.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCityController {
    @Autowired
    private CityRepository cityRepository;

    // This needs to be changed to a POST mapping - this is a placeholder
    @PostMapping("/api/cosmosdb/city/add")
    public ResponseEntity<CityEntity> cities(@RequestBody CityEntity addCity) {
        CityEntity savedCity = cityRepository.save(addCity);
        return new ResponseEntity<CityEntity>(savedCity, HttpStatus.CREATED);
    }
}
