package com.projectRaj.Restaurant.controller;

import com.projectRaj.Restaurant.entity.Restaurant;
import com.projectRaj.Restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("api/restaurant/id/{id}")
    public Object getRestaurant(@PathVariable Long id) {
        try{
            restaurantService.getRestaurantById(id);
        }
        catch (Exception e){
            String errorMsg = "No records found 🙁🙁🙁";
            return errorMsg;
        }
            String errorMessage = "Restaurant with ID " + id + " not found 🙁🙁🙁";
            return errorMessage; // Return an error message if user is not found
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
