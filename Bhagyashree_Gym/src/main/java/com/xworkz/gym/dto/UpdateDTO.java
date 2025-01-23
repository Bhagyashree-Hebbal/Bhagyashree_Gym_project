package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UpdateDTO {
    private int id;
    private String name;
    private long phoneNo;
    private String gymPackage;
    private String gymTrainer;
    private int amount;
    private int balance;
}
