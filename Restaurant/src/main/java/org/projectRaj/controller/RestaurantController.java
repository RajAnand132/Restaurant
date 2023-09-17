package org.projectRaj.controller;

import jakarta.validation.Valid;
import org.projectRaj.entity.Restaurant;
import org.projectRaj.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping("api/restaurant")
    public String addRestaurants(@RequestBody Restaurant restaurant) {
            restaurantService.addRestaurant(restaurant);
            return   "Restaurant added successfully 😊😊😊";
    }
    @GetMapping("api/restaurants")
    public List<Restaurant>retreiveRestaurants() {
        return restaurantService.getRestaurants();
    }



}
