package com.projectRaj.Restaurant.service;

import com.projectRaj.Restaurant.entity.Restaurant;
import com.projectRaj.Restaurant.repo.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    List<Restaurant> restaurantList;


    public void addAllRestaurant(List<Restaurant> restaurants) {
        restaurantList.addAll(restaurants);
    }

    public Restaurant getRestaurantById(Long id) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantId().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }


    public List<Restaurant> getRestaurants() {
        return restaurantList;
    }

    public String updateRestaurantById(long id, Restaurant updateData) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantId().equals(id)) {
                // Update the restaurant data based on the provided updateData
                restaurant.setRestaurantId(updateData.getRestaurantId());
                restaurant.setRestaurantName(updateData.getRestaurantName());
                restaurant.setRestaurantAddress(updateData.getRestaurantAddress());
                restaurant.setRestaurantPhoneNumber(updateData.getRestaurantPhoneNumber());
                restaurant.setRestaurantSpecialty(updateData.getRestaurantSpecialty());
                restaurant.setRestaurantTotalStaff(updateData.getRestaurantTotalStaff());
                restaurant.setRestaurantAverageRating(updateData.getRestaurantAverageRating());
                restaurant.setRestaurantMenuItems(updateData.getRestaurantMenuItems());
                restaurant.setRestaurantChefName(updateData.getRestaurantChefName());
                restaurant.setRestaurantWebsiteUrl(updateData.getRestaurantWebsiteUrl());
                restaurant.setRestaurantEmail(updateData.getRestaurantEmail());

                return "Restaurant updated successfully 😊😊😊";
            }
        }
        // Return a message indicating that the restaurant with the specified ID was not found
        return "Restaurant with ID " + id + " not found 🙁🙁🙁";
    }

    public String deleteRestaurantByName(String name) {
        for (Restaurant restaurant : restaurantList) {
            if (restaurant.getRestaurantName().equals(name)) {
                restaurantList.remove(restaurant);
                return "Restaurant deleted successfully 😒😒😒";
            }
        }
        return "Restaurant with name " + name + " not found 🙁🙁🙁";

    }
}
