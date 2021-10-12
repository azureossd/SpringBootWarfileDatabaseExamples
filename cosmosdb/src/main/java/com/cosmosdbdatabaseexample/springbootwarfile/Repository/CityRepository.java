package com.cosmosdbdatabaseexample.springbootwarfile.Repository;

import com.cosmosdbdatabaseexample.springbootwarfile.Entities.CityEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<CityEntity, String> {

}