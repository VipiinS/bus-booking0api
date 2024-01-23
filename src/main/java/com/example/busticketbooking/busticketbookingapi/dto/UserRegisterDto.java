package com.example.busticketbooking.busticketbookingapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterDto {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<String> roles;
}
