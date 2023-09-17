package org.projectRaj.service;

import org.projectRaj.entity.Restaurant;
import org.projectRaj.repo.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public  void addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantRepository.getRestaurantList().add(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return restaurantRepository.getRestaurantList();
    }
}
