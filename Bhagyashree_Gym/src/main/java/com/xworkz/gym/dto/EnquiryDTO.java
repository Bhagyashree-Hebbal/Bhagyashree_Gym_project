package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnquiryDTO {
    private int id;
    private String name;
    private String area;
    private long phoneNo;
    private double distance;
    private int age;
    //private String status;
}
