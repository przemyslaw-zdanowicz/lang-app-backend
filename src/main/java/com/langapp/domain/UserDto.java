package com.langapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    private UUID id;
    private String username;
    private String email;
    private int age;
    private Level currentLevel;
    private Long userPoints;
    private LocalDate registrationDate;
}
