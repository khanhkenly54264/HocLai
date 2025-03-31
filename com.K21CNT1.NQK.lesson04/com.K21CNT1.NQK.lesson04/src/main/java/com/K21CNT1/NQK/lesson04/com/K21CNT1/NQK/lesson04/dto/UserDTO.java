package com.K21CNT1.NQK.lesson04.com.K21CNT1.NQK.lesson04.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class UserDTO {
// Ussername
    @NotBlank (message = "Username cannot be blank")
    @Size(min=3, max=20,
            message = "Username must be between 3 to 20 characters")
    private String username;

// Password
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8,max = 30,
            message = "Password must be between 8 to 30 charactes")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$",
            message = "Password must contain at least one uppercase letter, one number, and one special character")
    private String password;

// Email
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private String email;

// Phone
    @NotBlank(message = "Phone number cannot be blank")
    @Pattern(
            regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$",
            message = "Invalid phone number format"
    )
    private String phone;

//Age
    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 100, message = "Age must be less than 100")
    private int age;

// Status
    @NotBlank(message = "Status cannot be blank")
    @Pattern(
            regexp = "^(Active|Inactive|Pending)$",
            message = "Status must be 'Active', 'Inactive', or 'Pending'"
    )
    private String status;
}
