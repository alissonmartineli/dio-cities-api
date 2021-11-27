package com.github.alissonmartineli.citiesapi.states.repositories;

import com.github.alissonmartineli.citiesapi.states.entities.State;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
