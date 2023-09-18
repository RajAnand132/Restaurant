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

    @Pattern(regexp = "\\+91\\d{10}", message = "Phone number is not valid")
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

}
