package com.cosmosdbdatabaseexample.springbootwarfile.Entities;

import org.springframework.data.annotation.Id;

public class CityEntity {
    @Id
    public String id;

    public String city;

    public void Cities() {
    }

    public void Cities(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, city='%s']", id, city);
    }

}