package com.github.alissonmartineli.citiesapi.cities.service;

import com.github.alissonmartineli.citiesapi.cities.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {

    @Autowired
    private CityRepository cityRepository;

    public Double distanceByPointsInMiles(Long city1, Long city2) {
        return cityRepository.distanceByPoints(city1, city2);
    }

    // TODO: Implement calculation using cube
    public Double distanceByCubeInMeters(Long city1, Long city2) {
        return null;
    }

}
