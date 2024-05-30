package com.example.customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be empty.")
    @Size(min = 5, max = 30, message = "Name should be between 5 to 30")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Pattern(regexp = "(^$[0-9]{10})", message = "Mobile number should be 10 digits")
    private String mobileNumber;
}
