package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistrationDTO {
    private int id;
    private String name;
    private String email;
    //private String password;
    private long phoneNo;
    private String gymName;
    private String gymPackage;
    private String gymTrainer;
    private double amount;
    private String discount;
    private int installment;
    private int paidAmount;
    private double balance;
}
