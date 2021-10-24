package com.cosmosdbdatabaseexample.springbootwarfile.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Cities")
public class CityEntity {
    @Id
    public String id;
    public String city;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void Cities() {
    }

    public void Cities(String id, String city) {
        this.id = id;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("City[id=%s, city='%s']", id, city);
    }

}