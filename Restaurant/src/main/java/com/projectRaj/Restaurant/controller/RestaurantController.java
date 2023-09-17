package com.projectRaj.Restaurant.controller;

import com.projectRaj.Restaurant.entity.Restaurant;
import com.projectRaj.Restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("api/restaurant/id/{id}")
    public ResponseEntity<Object> getRestaurant(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);

        if (restaurant == null) {
            String errorMessage = "Restaurant with ID " + id + " not found 🙁🙁🙁";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
        } else {
            return ResponseEntity.ok(restaurant);
        }
    }


    @GetMapping("api/restaurants")
    public List<Restaurant>retreiveRestaurants() {
        return restaurantService.getRestaurants();
    }

    @PostMapping("api/restaurant/list")
    public String addRestaurants(@RequestBody @Valid List<Restaurant> restaurants) {
        try {
            restaurantService.addAllRestaurant(restaurants);
            return  restaurants.size()+" Restaurant added successfully 😊😊😊";
        } catch (Exception e) {
            return "Failed to add restaurant 🙁🙁🙁";
        }
    }

    @PutMapping("api/restaurant/id/{id}")
    public String updateRestaurant(@PathVariable long id, @RequestBody Restaurant updateData){
        return restaurantService.updateRestaurantById(id, updateData);
    }

    @DeleteMapping("api/restaurant/name/{name}")
    public String deleteRestaurant(@PathVariable String name){
        return restaurantService.deleteRestaurantByName(name);
    }
}
