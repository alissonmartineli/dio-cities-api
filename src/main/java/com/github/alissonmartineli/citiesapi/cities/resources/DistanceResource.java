package com.github.alissonmartineli.citiesapi.cities.resources;

import com.github.alissonmartineli.citiesapi.cities.service.DistanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    @Autowired
    private DistanceService service;

    @GetMapping("/by-points")
    public Double byPoints(
            @RequestParam(name = "from") final Long city1,
            @RequestParam(name = "to") final Long city2) {
        return service.distanceByPointsInMiles(city1, city2);
    }

    @GetMapping("/by-cube")
    public Double byCube(
            @RequestParam(name = "from") final Long city1,
            @RequestParam(name = "to") final Long city2) {
        return service.distanceByCubeInMeters(city1, city2);
    }
}
