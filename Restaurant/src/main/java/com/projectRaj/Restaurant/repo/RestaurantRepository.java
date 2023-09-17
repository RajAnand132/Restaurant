package com.projectRaj.Restaurant.repo;

import com.projectRaj.Restaurant.entity.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepository {
    private List<Restaurant> restaurantList;
        public List<Restaurant> getRestaurantDB() {
            return restaurantList;
        }
}

