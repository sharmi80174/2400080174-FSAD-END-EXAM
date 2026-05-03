package com.klef.fsad.exam.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.repository.RestaurantRepository;

@Service
public class RestaurantService {

    private final RestaurantRepository repo;

    public RestaurantService(RestaurantRepository repo) {
        this.repo = repo;
    }

    public Restaurant addRestaurant(Restaurant r) {
        return repo.save(r);
    }

    public List<Restaurant> getAllRestaurants() {
        return repo.findAll();
    }
}