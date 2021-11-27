package com.github.alissonmartineli.citiesapi.countries.repositories;

import com.github.alissonmartineli.citiesapi.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
