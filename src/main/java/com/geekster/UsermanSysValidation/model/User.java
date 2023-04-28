package com.geekster.UsermanSysValidation.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    @NotBlank(message = "Name is mandatory")
    private String username;
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth should be in yyyy-MM-dd format")
    private LocalDate dateOfBirth;
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Invalid email format")
    private String email;
    @Pattern(regexp = "^\\+\\d{2}-\\d{10}$", message = "Phone number should be in +<country_code>-<phone_number> format")
    private String phoneNumber;
    private LocalDate date;
}
