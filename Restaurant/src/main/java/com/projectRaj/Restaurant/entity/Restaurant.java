package com.projectRaj.Restaurant.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @NotNull
    private Long restaurantId;

    @NotBlank
    private String restaurantName;

    @NotBlank
    private String restaurantAddress;

    private String restaurantPhoneNumber;

    @NotBlank
    private String restaurantSpecialty;

    @Min(value = 1, message = "Total staff must be at least 1")
    @Max(value = 100, message = "Total staff cannot exceed 100")
    private int restaurantTotalStaff;

    @DecimalMin(value = "0.0", message = "Average rating must be a non-negative number")
    @DecimalMax(value = "5.0", message = "Average rating cannot exceed 5.0")
    private double restaurantAverageRating;

    @NotEmpty
    private List<String> restaurantMenuItems;

    @NotEmpty
    private String restaurantChefName;

    @URL(message = "Invalid URL format")
    private String restaurantWebsiteUrl;

    @Email(message = "Invalid email format")
    private String restaurantEmail;

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhoneNumber() {
        return restaurantPhoneNumber;
    }

    public void setRestaurantPhoneNumber(String restaurantPhoneNumber) {
        this.restaurantPhoneNumber = restaurantPhoneNumber;
    }

    public String getRestaurantSpecialty() {
        return restaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        this.restaurantSpecialty = restaurantSpecialty;
    }

    public int getRestaurantTotalStaff() {
        return restaurantTotalStaff;
    }

    public void setRestaurantTotalStaff(int restaurantTotalStaff) {
        this.restaurantTotalStaff = restaurantTotalStaff;
    }

    public double getRestaurantAverageRating() {
        return restaurantAverageRating;
    }

    public void setRestaurantAverageRating(double restaurantAverageRating) {
        this.restaurantAverageRating = restaurantAverageRating;
    }

    public List<String> getRestaurantMenuItems() {
        return restaurantMenuItems;
    }

    public void setRestaurantMenuItems(List<String> restaurantMenuItems) {
        this.restaurantMenuItems = restaurantMenuItems;
    }

    public String getRestaurantChefName() {
        return restaurantChefName;
    }

    public void setRestaurantChefName(String restaurantChefName) {
        this.restaurantChefName = restaurantChefName;
    }

    public String getRestaurantWebsiteUrl() {
        return restaurantWebsiteUrl;
    }

    public void setRestaurantWebsiteUrl(String restaurantWebsiteUrl) {
        this.restaurantWebsiteUrl = restaurantWebsiteUrl;
    }

    public String getRestaurantEmail() {
        return restaurantEmail;
    }

    public void setRestaurantEmail(String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }
}
