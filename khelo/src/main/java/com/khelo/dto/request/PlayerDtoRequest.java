package com.khelo.dto.request;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDtoRequest {

    @NotBlank(message = "white space is not acceptable")
    @Size(min = 3,max = 20,message = "Firstname should be between 3 to 20")
    private String firstName;
    private String middleName;
    @NotBlank(message = "white space is not acceptable")
    @Size(min = 3,max = 20,message = "Firstname should be between 3 to 20")
    private String lastName;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone mumber")
    private String phoneNumber;
    @Email(message = "Invalid email entered")
    private String email;
    private String referralId;
}
