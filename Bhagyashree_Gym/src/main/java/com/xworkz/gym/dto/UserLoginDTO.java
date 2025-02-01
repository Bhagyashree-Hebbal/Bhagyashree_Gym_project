package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLoginDTO {
    private int id;
    private String email;
    private String password;
}
