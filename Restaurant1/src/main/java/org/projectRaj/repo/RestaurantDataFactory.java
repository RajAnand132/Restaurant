package org.projectRaj.repo;

import org.projectRaj.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestaurantDataFactory {
    @Bean
    List<Restaurant> getrestaurantSource()
    {
        return new ArrayList<>();
    }
}
