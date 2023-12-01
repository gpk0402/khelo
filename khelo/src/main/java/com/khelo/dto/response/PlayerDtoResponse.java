package com.khelo.dto.response;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDtoResponse {
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfBirth;
    private int gender;
}
