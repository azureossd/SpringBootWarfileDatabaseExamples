package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;
import com.cosmosdbdatabaseexample.springbootwarfile.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindAllByIdController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/api/cosmosdb/city/find/{id}")
    public CityEntity findById(@PathVariable String id) throws Exception {
        return cityRepository.findById(id).orElseThrow(() -> new Exception("Document not found with ID: " + id));
    }
}
