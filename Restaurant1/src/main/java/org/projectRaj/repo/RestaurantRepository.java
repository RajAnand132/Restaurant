package org.projectRaj.repo;

import org.projectRaj.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RestaurantRepository {
    @Autowired
    private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList(){
        return restaurantList;
    }
}