package com.klef.fsad.exam.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant r) {
        return service.addRestaurant(r);
    }

    @GetMapping("/all")
    public List<Restaurant> getRestaurants() {
        return service.getAllRestaurants();
    }
}