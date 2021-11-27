package com.github.alissonmartineli.citiesapi.states.resources;

import java.util.List;

import com.github.alissonmartineli.citiesapi.states.entities.State;
import com.github.alissonmartineli.citiesapi.states.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> findAll() {
        return repository.findAll();
    }
}
