package com.projectRaj.Restaurant.repo;

import com.projectRaj.Restaurant.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class RestaurantFactory {
    @Bean
    List<Restaurant> getRestaurantListInit()
    {
        System.out.println("New restaurant repository initialized & ready to accept new restaurants !!!!!!!!!!!!!!!");
        return new ArrayList<>();
    }
}
