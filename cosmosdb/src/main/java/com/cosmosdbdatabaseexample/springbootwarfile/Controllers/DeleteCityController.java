package com.cosmosdbdatabaseexample.springbootwarfile.Controllers;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;
import com.cosmosdbdatabaseexample.springbootwarfile.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteCityController {
    @Autowired
    private CityRepository cityRepository;
    
    @DeleteMapping("/api/cosmosdb/city/delete/{id}")
    public CityEntity deleteCity(@PathVariable String id) throws Exception{
        var findCity = cityRepository.findById(id).orElseThrow(() -> new Exception("Document not found with ID: " + id));
        cityRepository.deleteById(findCity.getId());
        return findCity;

    }
}
