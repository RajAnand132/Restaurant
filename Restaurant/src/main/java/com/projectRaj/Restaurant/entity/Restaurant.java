package com.projectRaj.Restaurant.entity;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@Component
public class Restaurant {
//    @NotNull
    private Long RestaurantId;

//    @NotBlank
    private String RestaurantName;

//    @NotBlank
    private String RestaurantAddress;

//    @Pattern(regexp = "\\+91-[0-9]{3}-[0-9]{3}-[0-9]{4}", message = "Invalid phone number format")
    private String RestaurantPhoneNumber;

//    @NotBlank
    private String RestaurantSpecialty;

//    @Min(value = 1, message = "Total staff must be at least 1")
//    @Max(value = 100, message = "Total staff cannot exceed 100")
    private int RestaurantTotalStaff;

//    @DecimalMin(value = "0.0", message = "Average rating must be a non-negative number")
//    @DecimalMax(value = "5.0", message = "Average rating cannot exceed 5.0")
    private double RestaurantAverageRating;

//    @NotEmpty
    private List<String> RestaurantMenuItems;

//    @NotEmpty
    private String RestaurantChefName;

//    @URL(message = "Invalid URL format")
    private String RestaurantWebsiteUrl;

//    @Email(message = "Invalid email format")
    private String RestaurantEmail;

    public Long getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        RestaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return RestaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        RestaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhoneNumber() {
        return RestaurantPhoneNumber;
    }

    public void setRestaurantPhoneNumber(String restaurantPhoneNumber) {
        RestaurantPhoneNumber = restaurantPhoneNumber;
    }

    public String getRestaurantSpecialty() {
        return RestaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        RestaurantSpecialty = restaurantSpecialty;
    }

    public int getRestaurantTotalStaff() {
        return RestaurantTotalStaff;
    }

    public void setRestaurantTotalStaff(int restaurantTotalStaff) {
        RestaurantTotalStaff = restaurantTotalStaff;
    }

    public double getRestaurantAverageRating() {
        return RestaurantAverageRating;
    }

    public void setRestaurantAverageRating(double restaurantAverageRating) {
        RestaurantAverageRating = restaurantAverageRating;
    }

    public List<String> getRestaurantMenuItems() {
        return RestaurantMenuItems;
    }

    public void setRestaurantMenuItems(List<String> restaurantMenuItems) {
        RestaurantMenuItems = restaurantMenuItems;
    }

    public String getRestaurantChefName() {
        return RestaurantChefName;
    }

    public void setRestaurantChefName(String restaurantChefName) {
        RestaurantChefName = restaurantChefName;
    }

    public String getRestaurantWebsiteUrl() {
        return RestaurantWebsiteUrl;
    }

    public void setRestaurantWebsiteUrl(String restaurantWebsiteUrl) {
        RestaurantWebsiteUrl = restaurantWebsiteUrl;
    }

    public String getRestaurantEmail() {
        return RestaurantEmail;
    }

    public void setRestaurantEmail(String restaurantEmail) {
        RestaurantEmail = restaurantEmail;
    }
}
